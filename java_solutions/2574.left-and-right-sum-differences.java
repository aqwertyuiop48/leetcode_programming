/*
 * @lc app=leetcode id=2574 lang=java
 *
 * [2574] Left and Right Sum Differences
 */

class Solution {
    public int[] leftRightDifference(int[] nums) {
        return IntStream.range(0, nums.length)
            .map(i -> Math.abs(IntStream.range(0, i).map(j -> nums[j]).sum() 
                             - IntStream.range(i + 1, nums.length).map(j -> nums[j]).sum()))
            .toArray();
    }
}
