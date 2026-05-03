/*
 * @lc app=leetcode id=3908 lang=java
 *
 * [3908] Valid Digit Number
 */

class Solution {
    public boolean validDigit(int n, int x) {
        return String.valueOf(n).indexOf((char)(x + '0')) > 0;
    }
}
