/*
 * @lc app=leetcode id=2563 lang=java
 *
 * [2563] Count the Number of Fair Pairs
 */

class Solution {
    public long countFairPairs(int[] nums, int lower, int upper) {
        return Stream.of(IntStream.range(0, nums.length).mapToLong(i -> (long) nums[i] << 20 | i).sorted().toArray())
            .mapToLong(A -> IntStream.range(0, A.length)
                .mapToLong(i -> (long) (~Arrays.binarySearch(A, i + 1, A.length, (long) (upper - (A[i] >> 20)) << 20 | 1048575L)) 
                                     - (~Arrays.binarySearch(A, i + 1, A.length, (long) (lower - (A[i] >> 20) - 1) << 20 | 1048575L)))
                .sum())
            .findFirst().getAsLong();
    }
}
