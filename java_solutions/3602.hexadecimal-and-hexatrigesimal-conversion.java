/*
 * @lc app=leetcode id=3602 lang=java
 *
 * [3602] Hexadecimal and Hexatrigesimal Conversion
 */

class Solution {
    public String concatHex36(int n) {
        return (Integer.toString(n * n, 16) + Integer.toString(n * n * n, 36)).toUpperCase();
    }
}
