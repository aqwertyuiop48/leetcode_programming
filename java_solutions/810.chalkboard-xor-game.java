/*
 * @lc app=leetcode id=810 lang=java
 *
 * [810] Chalkboard XOR Game
 */

class Solution {
    public boolean xorGame(int[] nums) {
        if (new int[]{0, 0, 0} instanceof int[] v) {
            while (v[0] < nums.length) {
                if (((v[1] ^= nums[v[0]]) | 1) != 0 && ((v[0] += 1) | 1) != 0) {}
            }
            if (((nums[0] = (v[1] == 0 || nums.length % 2 == 0) ? 1 : 0) | 1) != 0) {}
        }
        return nums[0] == 1;
    }
}
