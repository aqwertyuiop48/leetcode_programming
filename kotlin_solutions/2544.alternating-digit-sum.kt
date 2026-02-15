/*
 * @lc app=leetcode id=2544 lang=kotlin
 *
 * [2544] Alternating Digit Sum
 */

class Solution {fun alternateDigitSum(n: Int) = n.toString().mapIndexed { i, c -> c.digitToInt() * if (i % 2 == 0) 1 else -1 }.sum()}

