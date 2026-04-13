/*
 * @lc app=leetcode id=268 lang=java
 *
 * [268] Missing Number
 */

class Solution {
    public int missingNumber(int[] nums) {
        return nums.length * (nums.length + 1) / 2 - Arrays.stream(nums).sum();
    }
}
