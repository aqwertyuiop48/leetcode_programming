/*
 * @lc app=leetcode id=1503 lang=java
 *
 * [1503] Last Moment Before All Ants Fall Out of a Plank
 */

class Solution {
    public int getLastMoment(int n, int[] left, int[] right) {
        return Math.max(java.util.Arrays.stream(left).max().orElse(0), n - java.util.Arrays.stream(right).min().orElse(n));
    }
}
