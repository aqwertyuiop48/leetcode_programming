/*
 * @lc app=leetcode id=3560 lang=java
 *
 * [3560] Find Minimum Log Transportation Cost
 */

class Solution {
    public long minCuttingCost(int n, int m, int k) {
        return (m <= k && n <= k) ? 0L : ((m > k && n <= k) ? (long)(m - k) * k : ((n > k && m <= k) ? (long)(n - k) * k : 0L));
    }
}
