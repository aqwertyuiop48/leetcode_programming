/*
 * @lc app=leetcode id=3015 lang=kotlin
 *
 * [3015] Count the Number of Houses at a Certain Distance I
 */

class Solution { fun countOfPairs(n: Int, x: Int, y: Int): IntArray = IntArray(n).also { res -> (1..n).forEach { i -> (1..n).forEach { j -> if (i != j) minOf(Math.abs(i - j), Math.abs(i - x) + 1 + Math.abs(y - j), Math.abs(i - y) + 1 + Math.abs(x - j)).let { d -> res[d - 1]++ } } } } }