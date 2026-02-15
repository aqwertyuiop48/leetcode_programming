/*
 * @lc app=leetcode id=2643 lang=kotlin
 *
 * [2643] Row With Maximum Ones
 */

class Solution{fun rowAndMaximumOnes(mat: Array<IntArray>): IntArray =mat.mapIndexed { i, row -> intArrayOf(i, row.sum()) }.maxBy { it[1] }}

