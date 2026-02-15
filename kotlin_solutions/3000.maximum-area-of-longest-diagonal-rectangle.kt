/*
 * @lc app=leetcode id=3000 lang=kotlin
 *
 * [3000] Maximum Area of Longest Diagonal Rectangle
 */

class Solution {fun areaOfMaxDiagonal(dimensions: Array<IntArray>) = dimensions.groupBy { Math.sqrt(it[0] * it[0] + it[1] * it[1].toDouble()) }.maxByOrNull { it.key }?.value?.maxOfOrNull { it[0] * it[1] } ?: 0}

