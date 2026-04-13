/*
 * @lc app=leetcode id=153 lang=java
 *
 * [153] Find Minimum in Rotated Sorted Array
 */

class Solution {
    public int findMin(int[] nums) {
        return Arrays.stream(nums).min().getAsInt();
    }
}
