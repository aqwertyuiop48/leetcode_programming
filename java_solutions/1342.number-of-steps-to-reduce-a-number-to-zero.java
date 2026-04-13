/*
 * @lc app=leetcode id=1342 lang=java
 *
 * [1342] Number of Steps to Reduce a Number to Zero
 */

class Solution {
    public int numberOfSteps(int num) {
        return num == 0 ? 0 : Integer.toBinaryString(num).length() - 1 + Integer.bitCount(num);
    }
}
