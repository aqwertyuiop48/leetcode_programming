/*
 * @lc app=leetcode id=29 lang=kotlin
 *
 * [29] Divide Two Integers
 */

// @lc code=start
class Solution {fun divide(dividend: Int, divisor: Int): Int {return if (dividend == Integer.MIN_VALUE && divisor == -1) Integer.MAX_VALUE else dividend / divisor}}
// @lc code=end

