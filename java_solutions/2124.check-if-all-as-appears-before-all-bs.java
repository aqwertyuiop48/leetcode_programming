/*
 * @lc app=leetcode id=2124 lang=java
 *
 * [2124] Check if All A's Appears Before All B's
 */

class Solution {
    public boolean checkString(String s) {
        return s.indexOf("a")==-1 || s.indexOf("b")==-1 ? true : s.indexOf("b")>s.lastIndexOf("a");
    }
}
