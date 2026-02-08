/*
 * @lc app=leetcode id=12 lang=kotlin
 *
 * [12] Integer to Roman
 */

// @lc code=start
class Solution { fun intToRoman(num: Int): String = listOf(1000 to "M", 900 to "CM", 500 to "D", 400 to "CD", 100 to "C", 90 to "XC", 50 to "L", 40 to "XL", 10 to "X", 9 to "IX", 5 to "V", 4 to "IV", 1 to "I") .fold(num to "") { (n, s), (v, r) -> (n % v) to s + r.repeat(n / v) }.second }
// @lc code=end

