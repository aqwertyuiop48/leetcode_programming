/*
 * @lc app=leetcode id=171 lang=java
 *
 * [171] Excel Sheet Column Number
 */

class Solution {
    public int titleToNumber(String columnTitle) {
        return columnTitle.chars().reduce(0, (sum, ch) -> sum * 26 + (ch - 'A' + 1));
    }
}
