/*
 * @lc app=leetcode id=1337 lang=kotlin
 *
 * [1337] The K Weakest Rows in a Matrix
 */

class Solution { fun kWeakestRows(mat: Array<IntArray>, k: Int): IntArray = mat.indices.map { i -> i to mat[i].sum() }.sortedWith(compareBy<Pair<Int, Int>> { it.second }.thenBy { it.first }).take(k).map { it.first }.toIntArray() }