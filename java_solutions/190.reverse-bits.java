/*
 * @lc app=leetcode id=190 lang=java
 *
 * [190] Reverse Bits
 */

class Solution {
    public int reverseBits(int n) {
        return (Integer.valueOf( new StringBuilder(
            "0".repeat(32-Integer.toString(n,2).length()) + Integer.toString(n,2)
            ).reverse().toString() ,2));
    }
}
