/*
 * @lc app=leetcode id=3806 lang=java
 *
 * [3806] Maximum Bitwise AND After Increment Operations
 */

class Solution {
    public int maximumAND(int[] nums, int k, int m) {
        return (int) (long) IntStream.iterate(30, i -> i >= 0, i -> i - 1)
            .boxed()
            .reduce(0L, (res, i) -> Stream.of(res | (1L << i))
                .map(t -> Arrays.stream(nums)
                    .mapToLong(x -> (x & t) == t ? 0L : Stream.of(Long.highestOneBit(t & ~x))
                        .mapToLong(h -> (((long) x | h) & ~(h - 1)) + (t & (h - 1)) - x)
                        .findFirst()
                        .getAsLong())
                    .sorted()
                    .limit(m)
                    .sum() <= (long) k ? t : res)
                .findFirst()
                .get(), (a, b) -> a);
    }
}
