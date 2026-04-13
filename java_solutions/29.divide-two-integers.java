/*
 * @lc app=leetcode id=29 lang=java
 *
 * [29] Divide Two Integers
 */

class Solution {
    public int divide(int dividend, int divisor) {
        return (dividend == Integer.MIN_VALUE && divisor == -1) ? Integer.MAX_VALUE : (int)(dividend / divisor);
    }
}
