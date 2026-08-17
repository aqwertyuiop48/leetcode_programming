/*
 * @lc app=leetcode id=2923 lang=kotlin
 *
 * [2923] Find Champion I
 */

class Solution {
    fun findChampion(grid: Array<IntArray>): Int = grid.indexOfFirst { it.sum() == grid.size - 1 }
}