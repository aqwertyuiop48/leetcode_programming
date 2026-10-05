/*
 * @lc app=leetcode id=4040 lang=java
 *
 * [4040] Minimum Operations to Form Subset Sum I
 */

class Solution {
public int minOperations(int[] nums, int sum) {
    return IntStream.of(Arrays.stream(nums).boxed().reduce(
            IntStream.rangeClosed(0, sum).map(i -> i == 0 ? 0 : 1_000_000_000).toArray(),
            (dp, x) -> Stream.of(dp.clone()).peek(nd ->
                Stream.concat(
                        IntStream.iterate(0, j -> ((long) x << j) <= sum, j -> j + 1)
                            .mapToObj(j -> new int[]{x << j, j}),
                        IntStream.iterate(1, d -> (x >> d) > 0, d -> d + 1)
                            .filter(d -> (x >> d) <= sum)
                            .mapToObj(d -> new int[]{x >> d, d}))
                    .forEach(o -> IntStream.rangeClosed(0, sum - o[0])
                        .filter(s -> dp[s] != 1_000_000_000)
                        .forEach(s -> nd[s + o[0]] = Math.min(nd[s + o[0]], dp[s] + o[1]))))
                .findFirst().get(),
            (a, b) -> a))
        .skip(sum).map(v -> v >= 1_000_000_000 ? -1 : v).findFirst().getAsInt();
}
}
