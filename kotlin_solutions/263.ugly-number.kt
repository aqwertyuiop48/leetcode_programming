/*
 * @lc app=leetcode id=263 lang=kotlin
 *
 * [263] Ugly Number
 */

class Solution {fun isUgly(n: Int) = if (n < 1) false else intArrayOf(2, 3, 5).fold(n) { num, factor -> generateSequence(num) { if (it % factor == 0) it / factor else null }.last() } == 1}

