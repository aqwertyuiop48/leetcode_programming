/*
 * @lc app=leetcode id=1039 lang=kotlin
 *
 * [1039] Minimum Score Triangulation of Polygon
 */

class Solution { fun minScoreTriangulation(values: IntArray): Int = Array(values.size) { IntArray(values.size) }.apply { (2 until values.size).forEach { len -> (0 until values.size - len).forEach { i -> (i + len).let { j -> this[i][j] = (i + 1 until j).minOf { k -> this[i][k] + this[k][j] + values[i] * values[k] * values[j] } } } } }[0][values.size - 1] }