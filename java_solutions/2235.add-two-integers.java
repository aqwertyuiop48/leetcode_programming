/*
 * @lc app=leetcode id=2235 lang=java
 *
 * [2235] Add Two Integers
 */

class Solution {
    public int sum(int num1, int num2) {
        return num2 == 0 ? num1 : sum(num1 ^ num2, (num1 & num2) << 1);
    }
}
