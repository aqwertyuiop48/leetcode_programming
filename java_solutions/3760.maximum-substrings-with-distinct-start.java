/*
 * @lc app=leetcode id=3760 lang=java
 *
 * [3760] Maximum Substrings With Distinct Start
 */

class Solution {
    public int maxDistinct(String s) {
        return (int) s.chars().distinct().count();
    }
}
