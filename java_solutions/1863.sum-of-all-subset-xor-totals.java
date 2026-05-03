/*
 * @lc app=leetcode id=1863 lang=java
 *
 * [1863] Sum of All Subset XOR Totals
 */

class Solution {
    public int subsetXORSum(int[] nums) {
        return java.util.Arrays.stream(nums).reduce(0, (a, b) -> a | b) << (nums.length - 1);
    }
}
