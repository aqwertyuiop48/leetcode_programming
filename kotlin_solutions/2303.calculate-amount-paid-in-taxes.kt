/*
 * @lc app=leetcode id=2303 lang=kotlin
 *
 * [2303] Calculate Amount Paid in Taxes
 */

class Solution {fun calculateTax(brackets: Array<IntArray>, income: Int): Double = brackets.fold(Triple(0.0, income, 0)) { (ans, rem, lower), bracket -> if (rem <= 0) return ans else minOf(rem, bracket[0] - lower).let { amt -> Triple(ans + bracket[1] * amt / 100.0, rem - amt, bracket[0]) } }.first}
