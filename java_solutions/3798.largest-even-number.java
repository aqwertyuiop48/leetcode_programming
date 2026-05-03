/*
 * @lc app=leetcode id=3798 lang=java
 *
 * [3798] Largest Even Number
 */

class Solution {
    public String largestEven(String s) {
        return s.lastIndexOf('2') != -1 ? s.substring(0, s.lastIndexOf('2') + 1) : "";
    }
}
