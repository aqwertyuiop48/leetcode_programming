/*
 * @lc app=leetcode id=2278 lang=java
 *
 * [2278] Percentage of Letter in String
 */

class Solution {
    public int percentageLetter(String s, char letter) {
        return (int)s.chars().filter(i->i==letter).count()*100 / s.length();
    }
}
