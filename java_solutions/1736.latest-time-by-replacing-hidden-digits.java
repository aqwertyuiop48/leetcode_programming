/*
 * @lc app=leetcode id=1736 lang=java
 *
 * [1736] Latest Time by Replacing Hidden Digits
 */

class Solution {
    public String maximumTime(String t) {
        return (t.charAt(0) == '?' ? (t.charAt(1) == '?' || t.charAt(1) < '4' ? "2" : "1") : t.charAt(0) + "") 
             + (t.charAt(1) == '?' ? (t.charAt(0) == '2' || (t.charAt(0) == '?' && (t.charAt(1) == '?' || t.charAt(1) < '4')) ? "3" : "9") : t.charAt(1) + "") 
             + ":" 
             + (t.charAt(3) == '?' ? "5" : t.charAt(3) + "") 
             + (t.charAt(4) == '?' ? "9" : t.charAt(4) + "");
    }
}
