/*
 * @lc app=leetcode id=1006 lang=java
 *
 * [1006] Clumsy Factorial
 */

class Solution { public int clumsy(int n) { return n <= 2 ? n : n == 3 ? 6 : n == 4 ? 7 : n % 4 == 0 ? n + 1 : n % 4 <= 2 ? n + 2 : n - 1; } }
