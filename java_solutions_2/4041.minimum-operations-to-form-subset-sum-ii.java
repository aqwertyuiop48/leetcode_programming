/*
 * @lc app=leetcode id=4041 lang=java
 *
 * [4041] Minimum Operations to Form Subset Sum II
 */

class Solution {
public int minOperations(int[] nums, int sum) {
    return IntStream.of(Arrays.stream(nums).boxed().reduce(
            IntStream.rangeClosed(0, sum).map(i -> i == 0 ? 0 : 1_000_000_000).toArray(),
            (dp, x) -> Stream.of(dp.clone()).peek(nd ->
                IntStream.iterate(0, d -> (x >> d) > 0, d -> d + 1).boxed()
                    .flatMap(d -> IntStream.iterate(0, j -> ((long) (x >> d) << j) <= sum, j -> j + 1)
                        .mapToObj(j -> new int[]{(x >> d) << j, d + j}))
                    .forEach(o -> IntStream.rangeClosed(0, sum - o[0])
                        .filter(s -> dp[s] != 1_000_000_000)
                        .forEach(s -> nd[s + o[0]] = Math.min(nd[s + o[0]], dp[s] + o[1]))))
                .findFirst().get(),
            (a, b) -> a))
        .skip(sum).map(v -> v >= 1_000_000_000 ? -1 : v).findFirst().getAsInt();
}
}
