/*
 * @lc app=leetcode id=2546 lang=java
 *
 * [2546] Apply Bitwise Operations to Make Strings Equal
 */

class Solution {
    public boolean makeStringsEqual(String s, String target) {
        return s.contains("1") == target.contains("1");
    }
}
