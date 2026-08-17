/*
 * @lc app=leetcode id=3096 lang=kotlin
 *
 * [3096] Minimum Levels to Gain More Points
 */

class Solution { fun minimumLevels(possible: IntArray): Int = possible.sumOf { if (it == 1) 1 else -1 }.let { total -> possible.dropLast(1).scan(0) { acc, x -> acc + if (x == 1) 1 else -1 }.drop(1).indexOfFirst { 2 * it > total }.let { if (it == -1) -1 else it + 1 } } }