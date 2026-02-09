/*
 * @lc app=leetcode id=85 lang=kotlin
 *
 * [85] Maximal Rectangle
 */

class Solution { fun maximalRectangle(matrix: Array<CharArray>) = if (matrix.isEmpty() || matrix[0].isEmpty()) 0 else IntArray(matrix[0].size + 1).let { h -> matrix.fold(0) { m, row -> row.forEachIndexed { i, ch -> h[i] = if (ch == '1') h[i] + 1 else 0 } .run { ArrayDeque<Int>().run { h.indices.fold(m) { maxArea, i -> generateSequence(maxArea) { area -> (isNotEmpty() && h[i] < h[last()]).takeIf { it }?.let { removeLast().let { top -> area.coerceAtLeast(h[top] * (if (isEmpty()) i else i - last() - 1)) } } }.last().also { addLast(i) } } } } } } }
