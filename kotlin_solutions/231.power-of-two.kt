/*
 * @lc app=leetcode id=231 lang=kotlin
 *
 * [231] Power of Two
 */

class Solution {fun isPowerOfTwo(n: Int): Boolean {return if (n <= 0) false else n and n - 1 == 0    }}

