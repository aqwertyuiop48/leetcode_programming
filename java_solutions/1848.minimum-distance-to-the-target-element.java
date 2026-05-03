/*
 * @lc app=leetcode id=1848 lang=java
 *
 * [1848] Minimum Distance to the Target Element
 */

class Solution {
    public int getMinDistance(int[] nums, int target, int start) {
        return java.util.stream.IntStream.range(0, nums.length).filter(i -> nums[i] == target).map(i -> Math.abs(i - start)).min().getAsInt();
    }
}
