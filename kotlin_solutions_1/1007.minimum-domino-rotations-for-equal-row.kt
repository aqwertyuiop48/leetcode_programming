/*
 * @lc app=leetcode id=1007 lang=kotlin
 *
 * [1007] Minimum Domino Rotations For Equal Row
 */
class Solution { fun minDominoRotations(tops: IntArray, bottoms: IntArray): Int = tops.indices.fold(IntArray(9).also { it[0] = tops[0] }.also { it[1] = bottoms[0] }.also { it[6] = 1 }.also { it[7] = 1 }) { acc, i -> acc.also { if (tops[i] != it[0] && bottoms[i] != it[0]) it[6] = 0 }.also { if (tops[i] != it[1] && bottoms[i] != it[1]) it[7] = 0 }.also { if (tops[i] != it[0]) it[2]++ }.also { if (bottoms[i] != it[0]) it[3]++ }.also { if (tops[i] != it[1]) it[4]++ }.also { if (bottoms[i] != it[1]) it[5]++ } }.let { v -> if (v[6] == 1 && v[7] == 1) kotlin.math.min(kotlin.math.min(v[2], v[3]), kotlin.math.min(v[4], v[5])) else if (v[6] == 1) kotlin.math.min(v[2], v[3]) else if (v[7] == 1) kotlin.math.min(v[4], v[5]) else -1 } }