/*
 * @lc app=leetcode id=3801 lang=java
 *
 * [3801] Minimum Cost to Merge Sorted Lists
 */

class Solution {
    public long minMergeCost(int[][] lists) {
        return (long) Stream.<long[][]>of(new long[3][1 << lists.length])
            .peek(s -> IntStream.range(1, 1 << lists.length).forEach(mask -> Stream.of(IntStream.range(0, lists.length).filter(i -> (mask & (1 << i)) != 0).flatMap(i -> Arrays.stream(lists[i])).sorted().toArray())
                .peek(arr -> s[1][mask] = arr.length)
                .forEach(arr -> s[0][mask] = arr[(arr.length - 1) / 2])))
            .map(s -> IntStream.range(1, 1 << lists.length)
                .peek(mask -> s[2][mask] = (mask & (mask - 1)) == 0 ? 0L : IntStream.iterate((mask - 1) & mask, a -> a > 0, a -> (a - 1) & mask)
                    .mapToLong(a -> s[2][a] + s[2][mask ^ a] + s[1][mask] + Math.abs(s[0][a] - s[0][mask ^ a]))
                    .min().orElse(0L))
                .toArray() != null ? s[2][(1 << lists.length) - 1] : 0L)
            .findFirst().get();
    }
}
