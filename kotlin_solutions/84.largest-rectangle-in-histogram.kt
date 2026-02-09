/*
 * @lc app=leetcode id=84 lang=kotlin
 *
 * [84] Largest Rectangle in Histogram
 */

class Solution { fun largestRectangleArea(h: IntArray) = ArrayDeque<Int>().let { s -> generateSequence(0 to 0) { (i, m) -> (i < h.size || s.isNotEmpty()).takeIf { it }?.let { if (i < h.size && (s.isEmpty() || h[i] >= h[s.last()])) s.addLast(i).let { (i + 1) to m } else s.removeLast().let { top -> (i to m.coerceAtLeast(h[top] * (if (s.isEmpty()) i else i - s.last() - 1))) } } }.last().second } }

