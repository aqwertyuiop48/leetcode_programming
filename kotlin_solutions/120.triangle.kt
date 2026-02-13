/*
 * @lc app=leetcode id=120 lang=kotlin
 *
 * [120] Triangle
 */

class Solution {fun minimumTotal(triangle: List<List<Int>>): Int =triangle.fold(listOf(0)) { prev, row ->row.indices.map { i -> row[i] + minOf(prev.getOrElse(i) { Int.MAX_VALUE }, prev.getOrElse(i - 1) { Int.MAX_VALUE }) }}.minOrNull() ?: 0}
