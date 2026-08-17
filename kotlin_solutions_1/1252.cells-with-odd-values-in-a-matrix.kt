/*
 * @lc app=leetcode id=1252 lang=kotlin
 *
 * [1252] Cells with Odd Values in a Matrix
 */

class Solution { fun oddCells(n: Int, m: Int, indices: Array<IntArray>): Int = IntArray(n).let { r -> IntArray(m).let { c -> indices.forEach { idx -> r[idx[0]]++.also { c[idx[1]]++ } }.let { (0 until n).sumOf { i -> (0 until m).count { j -> (r[i] + c[j]) % 2 != 0 } } } } } }