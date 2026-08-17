/*
 * @lc app=leetcode id=2946 lang=kotlin
 *
 * [2946] Matrix Similarity After Cyclic Shifts
 */

class Solution {
    fun areSimilar(mat: Array<IntArray>, k: Int): Boolean = mat.all { row -> row.indices.all { c -> row[c] == row[(c + k) % row.size] } }
}