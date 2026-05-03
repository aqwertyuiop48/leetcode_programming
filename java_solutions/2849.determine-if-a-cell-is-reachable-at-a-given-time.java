/*
 * @lc app=leetcode id=2849 lang=java
 *
 * [2849] Determine if a Cell Is Reachable at a Given Time
 */

class Solution { public boolean isReachableAtTime(int sx, int sy, int fx, int fy, int t) { return sx == fx && sy == fy && t == 1 ? false : Math.max(Math.abs(sx - fx), Math.abs(sy - fy)) <= t; } }
