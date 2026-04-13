/*
 * @lc app=leetcode id=2656 lang=java
 *
 * [2656] Maximum Sum With Exactly K Elements 
 */

class Solution {
    public int maximizeSum(int[] nums, int k) {
        return Arrays.stream(nums).max().getAsInt() * k + k * (k - 1) / 2;
    }
}
