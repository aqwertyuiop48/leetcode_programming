/*
 * @lc app=leetcode id=2481 lang=java
 *
 * [2481] Minimum Cuts to Divide a Circle
 */

class Solution {
    public int numberOfCuts(int n) {
        return (n==1) ? 0 : (n%2==0) ? n/2 : n;
    }
}
