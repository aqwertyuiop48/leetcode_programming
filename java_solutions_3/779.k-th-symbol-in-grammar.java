/*
 * @lc app=leetcode id=779 lang=java
 *
 * [779] K-th Symbol in Grammar
 */

class Solution {
    public int kthGrammar(int n, int k) {
        return Integer.bitCount(k - 1) & 1;
    }
}
