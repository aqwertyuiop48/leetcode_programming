/*
 * @lc app=leetcode id=174 lang=kotlin
 *
 * [174] Dungeon Game
 */

class Solution { fun calculateMinimumHP(dungeon: Array<IntArray>): Int = Array(dungeon.size) { IntArray(dungeon[0].size) }.apply { this[lastIndex][this[0].lastIndex] = maxOf(1, 1 - dungeon.last().last()) }.also { (it.lastIndex - 1 downTo 0).forEach { i -> it[i][it[0].lastIndex] = maxOf(1, it[i + 1][it[0].lastIndex] - dungeon[i][it[0].lastIndex]) } }.also { (it[0].lastIndex - 1 downTo 0).forEach { j -> it[it.lastIndex][j] = maxOf(1, it[it.lastIndex][j + 1] - dungeon[it.lastIndex][j]) } }.also { (it.lastIndex - 1 downTo 0).forEach { i -> (it[0].lastIndex - 1 downTo 0).forEach { j -> it[i][j] = maxOf(1, minOf(it[i + 1][j], it[i][j + 1]) - dungeon[i][j]) } } }[0][0] }
