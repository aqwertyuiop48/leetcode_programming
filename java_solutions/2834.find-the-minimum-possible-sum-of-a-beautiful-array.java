/*
 * @lc app=leetcode id=2834 lang=java
 *
 * [2834] Find the Minimum Possible Sum of a Beautiful Array
 */

class Solution {
    public int minimumPossibleSum(int n, int target) {
        return (int) (((long)Math.min(n, target / 2) * (Math.min(n, target / 2) + 1) / 2 + (long)(n - Math.min(n, target / 2)) * (2L * target + n - Math.min(n, target / 2) - 1) / 2) % 1000000007);
    }
}
