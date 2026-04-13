/*
 * @lc app=leetcode id=459 lang=java
 *
 * [459] Repeated Substring Pattern
 */

class Solution {
    public boolean repeatedSubstringPattern(String s) {
        return s.matches("(.+)\\1+");
    }
}
