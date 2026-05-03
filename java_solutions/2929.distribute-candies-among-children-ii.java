/*
 * @lc app=leetcode id=2929 lang=java
 *
 * [2929] Distribute Candies Among Children II
 */

class Solution {
    public long distributeCandies(int n, int limit) {
        return (new long[]{0} instanceof long[] r) ? (long)(n > 3L * limit ? 0 : ((long)(n + 2) * (n + 1) / 2 - (n > limit ? 3L * (n - limit + 1) * (n - limit) / 2 : 0) + (n > 2L * limit ? 3L * (n - 2L * limit) * (n - 2L * limit - 1) / 2 : 0))) : 0;
    }
}
