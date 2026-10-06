/*
 * @lc app=leetcode id=775 lang=java
 *
 * [775] Global and Local Inversions
 */

class Solution {
    public boolean isIdealPermutation(int[] nums) {
        return java.util.stream.IntStream.range(0, nums.length).allMatch(i -> Math.abs(nums[i] - i) <= 1);
    }
}
