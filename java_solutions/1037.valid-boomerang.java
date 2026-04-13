/*
 * @lc app=leetcode id=1037 lang=java
 *
 * [1037] Valid Boomerang
 */

class Solution {
    public boolean isBoomerang(int[][] p) {
        return (p[0][0] * (p[1][1] - p[2][1]) + p[1][0] * (p[2][1] - p[0][1]) + p[2][0] * (p[0][1] - p[1][1])) != 0;
    }
}
