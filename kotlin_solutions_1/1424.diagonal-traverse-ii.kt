/*
 * @lc app=leetcode id=1424 lang=kotlin
 *
 * [1424] Diagonal Traverse II
 */

class Solution { fun findDiagonalOrder(nums: List<List<Int>>): IntArray = nums.flatMapIndexed { i, row -> row.mapIndexed { j, num -> Triple(i + j, j, num) } }.sortedWith(compareBy({ it.first }, { it.second })).map { it.third }.toIntArray() }