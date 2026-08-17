/*
 * @lc app=leetcode id=3529 lang=kotlin
 *
 * [3529] Count Cells in Overlapping Horizontal and Vertical Substrings
 */

class Solution { fun countCells(g: Array<CharArray>, p: String): Int = g.size.let { R -> g[0].size.let { C -> p.length.let { P -> Array(R) { BooleanArray(C) }.also { hasH -> (0 until R).forEach { r -> String(g[r]).let { rowStr -> (0..C - P).filter { rowStr.startsWith(p, it) }.forEach { startC -> (startC until startC + P).forEach { c -> hasH[r][c] = true } } } } }.let { hasH -> Array(R) { BooleanArray(C) }.also { hasV -> (0 until C).forEach { c -> (0 until R).map { g[it][c] }.joinToString("").let { colStr -> (0..R - P).filter { colStr.startsWith(p, it) }.forEach { startR -> (startR until startR + P).forEach { r -> hasV[r][c] = true } } } } }.let { hasV -> (0 until R).sumOf { r -> (0 until C).count { c -> hasH[r][c] && hasV[r][c] } } } } } } } }