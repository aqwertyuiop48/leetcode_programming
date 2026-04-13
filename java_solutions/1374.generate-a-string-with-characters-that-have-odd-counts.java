/*
 * @lc app=leetcode id=1374 lang=java
 *
 * [1374] Generate a String With Characters That Have Odd Counts
 */

class Solution {
    public String generateTheString(int n) {
        return n==1 ? "a" : n%2==0 ? "a" + "b".repeat(n-1) :  "ac" + "b".repeat(n-2);
    }
}
