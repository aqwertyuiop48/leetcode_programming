/*
 * @lc app=leetcode id=342 lang=kotlin
 *
 * [342] Power of Four
 */

class Solution { fun isPowerOfFour(n: Int): Boolean = n > 0 && (n and (n - 1)) == 0 && (n and 0x55555555) != 0}