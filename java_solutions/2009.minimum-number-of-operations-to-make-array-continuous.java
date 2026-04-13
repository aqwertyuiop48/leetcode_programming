/*
 * @lc app=leetcode id=2009 lang=java
 *
 * [2009] Minimum Number of Operations to Make Array Continuous
 */

class Solution {
    public int minOperations(int[] nums) {
        return ((Function<int[], Integer>) u -> nums.length - IntStream.range(0, u.length).map(i -> ((IntUnaryOperator) idx -> (idx >= 0 ? idx : -idx - 2) - i + 1).applyAsInt(Arrays.binarySearch(u, u[i] + nums.length - 1))).max().orElse(0)).apply(IntStream.of(nums).sorted().distinct().toArray());
    }
}
