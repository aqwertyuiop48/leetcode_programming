/*
 * @lc app=leetcode id=65 lang=java
 *
 * [65] Valid Number
 */

class Solution {
    public boolean isNumber(String s) {
        return s.matches("^[+-]?(\\d+\\.?\\d*|\\.\\d+)([eE][+-]?\\d+)?$");
    }
}
