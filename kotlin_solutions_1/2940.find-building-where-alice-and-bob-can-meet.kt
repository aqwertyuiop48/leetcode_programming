/*
 * @lc app=leetcode id=2940 lang=kotlin
 *
 * [2940] Find Building Where Alice and Bob Can Meet
 */

class Solution { fun leftmostBuildingQueries(heights: IntArray, queries: Array<IntArray>): IntArray = IntArray(4 * heights.size).let { st -> Array<(Int, Int, Int) -> Int>(1) { { _, _, _ -> 0 } }.also { box -> box[0] = { i, L, R -> if (L == R) heights[L].also { st[i] = it } else Math.max(box[0](2 * i + 1, L, (L + R) / 2), box[0](2 * i + 2, (L + R) / 2 + 1, R)).also { st[i] = it } } }[0](0, 0, heights.size - 1).let { Array<(Int, Int, Int, Int, Int, Int) -> Int>(1) { { _, _, _, _, _, _ -> 0 } }.also { box -> box[0] = { i, L, R, ql, qr, target -> if (R < ql || L > qr || st[i] <= target) -1 else if (L == R) L else ((L + R) / 2).let { mid -> box[0](2 * i + 1, L, mid, ql, qr, target).let { leftRes -> if (leftRes != -1) leftRes else box[0](2 * i + 2, mid + 1, R, ql, qr, target) } } } }.let { qBox -> queries.map { q -> Math.min(q[0], q[1]).let { a -> Math.max(q[0], q[1]).let { b -> if (a == b || heights[a] < heights[b]) b else qBox[0](0, 0, heights.size - 1, b + 1, heights.size - 1, Math.max(heights[a], heights[b])) } } }.toIntArray() } } }