/*
 * @lc app=leetcode id=2554 lang=kotlin
 *
 * [2554] Maximum Number of Integers to Choose From a Range I
 */

class Solution { fun maxCount(banned: IntArray, n: Int, maxSum: Int): Int = banned.toSet().let { b -> (1..n).fold(0 to 0) { (c, s), i -> if (i !in b && s + i <= maxSum) (c + 1) to (s + i) else c to s }.first } }