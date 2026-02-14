/*
 * @lc app=leetcode id=497 lang=kotlin
 *
 * [497] Random Point in Non-overlapping Rectangles
 */

import kotlin.random.Random class Solution(val rects: Array<IntArray>, val sums: IntArray = IntArray(rects.size).apply {(0 until rects.size).forEach { i -> this[i] = (1 + rects[i][2] - rects[i][0]) * (1 + rects[i][3] - rects[i][1]) + if (i > 0) this[i - 1] else 0 }}) {fun pick() = sums.binarySearch(Random.nextInt(0, sums.last() + 1)).let { if (it >= 0) it else -(it + 1) }.let { intArrayOf(Random.nextInt(rects[it][0], rects[it][2] + 1), Random.nextInt(rects[it][1], rects[it][3] + 1)) }}

