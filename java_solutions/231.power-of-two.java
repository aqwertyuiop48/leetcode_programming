/*
 * @lc app=leetcode id=231 lang=java
 *
 * [231] Power of Two
 */

class Solution {
    public boolean isPowerOfTwo(int n) {
        return Math.abs(Math.log(n) / Math.log(2) - Math.round(Math.log(n) / Math.log(2))) < 1e-10;
    }
}
