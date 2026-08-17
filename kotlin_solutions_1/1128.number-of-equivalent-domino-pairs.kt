/*
 * @lc app=leetcode id=1128 lang=kotlin
 *
 * [1128] Number of Equivalent Domino Pairs
 */

class Solution { fun numEquivDominoPairs(dominoes: Array<IntArray>): Int = dominoes .map { if (it[0] < it[1]) it[0] * 10 + it[1] else it[1] * 10 + it[0] } .groupingBy { it } .eachCount() .values .sumOf { it * (it - 1) / 2 } }