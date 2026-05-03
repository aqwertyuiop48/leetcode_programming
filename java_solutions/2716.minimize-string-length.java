/*
 * @lc app=leetcode id=2716 lang=java
 *
 * [2716] Minimize String Length
 */

class Solution {
    public int minimizedStringLength(String s) {
        return (int) s.chars().distinct().count();
    }
}
