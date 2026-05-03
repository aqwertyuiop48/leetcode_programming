/*
 * @lc app=leetcode id=343 lang=java
 *
 * [343] Integer Break
 */

class Solution {
    public int integerBreak(int n) {
        return n <= 3 ? n - 1 : (int) Math.pow(3, n / 3 - (n % 3 == 1 ? 1 : 0)) * (n % 3 == 0 ? 1 : (n % 3 == 1 ? 4 : 2));
    }
}
