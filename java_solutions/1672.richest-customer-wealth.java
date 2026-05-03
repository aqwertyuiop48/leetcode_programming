/*
 * @lc app=leetcode id=1672 lang=java
 *
 * [1672] Richest Customer Wealth
 */

class Solution {
    public int maximumWealth(int[][] accounts) {
        return java.util.Arrays.stream(accounts).mapToInt(a -> java.util.Arrays.stream(a).sum()).max().orElse(0);
    }
}
