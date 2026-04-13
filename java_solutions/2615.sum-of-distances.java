/*
 * @lc app=leetcode id=2615 lang=java
 *
 * [2615] Sum of Distances
 */

class Solution {
    public long[] distance(int[] arr) {
        return IntStream.of(arr.length).mapToObj(long[]::new)
            .peek(ans -> IntStream.range(0, arr.length).boxed()
                .collect(Collectors.groupingBy(i -> arr[i]))
                .forEach((val, ids) -> ids.stream().sorted().collect(Collectors.toList()).stream()
                    .collect(() -> new long[]{ids.stream().mapToLong(n -> n).sum(), 0, 0}, 
                        (s, cur) -> ans[cur.intValue()] = (s[2] * cur - s[1]) + ((s[0] - s[1] - cur) - (ids.size() - 1 - s[2]++) * cur) + (s[1] += cur) * 0, 
                        (a, b) -> {})))
            .findFirst().get();
    }
}
