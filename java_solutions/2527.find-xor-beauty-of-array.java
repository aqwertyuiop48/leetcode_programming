/*
 * @lc app=leetcode id=2527 lang=java
 *
 * [2527] Find Xor-Beauty of Array
 */

class Solution {
    public int xorBeauty(int[] nums) {
        return Arrays.stream(nums).reduce(0, (a, b) -> a ^ b);
    }
}
