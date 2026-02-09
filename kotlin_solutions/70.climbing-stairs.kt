/*
 * @lc app=leetcode id=70 lang=kotlin
 *
 * [70] Climbing Stairs
 */

class Solution {fun climbStairs(n: Int): Int = (2..n).fold(1 to 1) { (a, b), _ -> b to a + b }.second}
