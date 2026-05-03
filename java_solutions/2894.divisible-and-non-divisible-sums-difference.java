/*
 * @lc app=leetcode id=2894 lang=java
 *
 * [2894] Divisible and Non-divisible Sums Difference
 */

class Solution { public int differenceOfSums(int n, int m) { return n * (n + 1) / 2 - 2 * (m * (n / m) * (n / m + 1) / 2); } }
