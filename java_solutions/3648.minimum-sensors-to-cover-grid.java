/*
 * @lc app=leetcode id=3648 lang=java
 *
 * [3648] Minimum Sensors to Cover Grid
 */

class Solution {
    public int minSensors(int n, int m, int k) {
        return ((n + 2 * k) / (2 * k + 1)) * ((m + 2 * k) / (2 * k + 1));
    }
}
