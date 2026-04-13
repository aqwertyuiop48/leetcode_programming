/*
 * @lc app=leetcode id=1784 lang=java
 *
 * [1784] Check if Binary String Has at Most One Segment of Ones
 */

class Solution {
    public boolean checkOnesSegment(String s) {
        return s.length()>1 
        ?(int)s.chars().filter(i->i=='1').count()>1 ?s.contains("1".repeat((int)s.chars().filter(i->i=='1').count())):s.contains("1")
        :s.contains("1");
    }
}
