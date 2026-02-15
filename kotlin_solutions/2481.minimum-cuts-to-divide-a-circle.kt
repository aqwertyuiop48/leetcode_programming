/*
 * @lc app=leetcode id=2481 lang=kotlin
 *
 * [2481] Minimum Cuts to Divide a Circle
 */

class Solution {fun numberOfCuts(n: Int): Int =if (n == 1) 0 else if (n % 2 == 0) n / 2 else n}
