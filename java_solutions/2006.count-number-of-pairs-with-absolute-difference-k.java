/*
 * @lc app=leetcode id=2006 lang=java
 *
 * [2006] Count Number of Pairs With Absolute Difference K
 */

class Solution {
    public int countKDifference(int[] nums, int k) {
        return (int) IntStream.range(0, nums.length)
            .flatMap(i -> IntStream.range(i + 1, nums.length)
                .filter(j -> Math.abs(nums[i] - nums[j]) == k))
            .count();
    }
}
