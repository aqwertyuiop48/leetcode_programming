/*
 * @lc app=leetcode id=258 lang=java
 *
 * [258] Add Digits
 */

class Solution {
    public int addDigits(int num) {
        return num < 10 ? num : addDigits(String.valueOf(num).chars().map(c -> c - '0').sum());
    }
}
