/*
 * @lc app=leetcode id=118 lang=kotlin
 *
 * [118] Pascal's Triangle
 */

class Solution { fun generate(numRows: Int): List<List<Int>> { return generateSequence(listOf(1)) { current -> List(current.size + 1) { current.getOrElse(it - 1) { 0 } + current.getOrElse(it) { 0 } } }.take(numRows).toList() } }

