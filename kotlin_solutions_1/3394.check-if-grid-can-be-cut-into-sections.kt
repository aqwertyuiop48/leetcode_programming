/*
 * @lc app=leetcode id=3394 lang=java
 *
 * [3394] Check if Grid can be Cut into Sections
 */

fun checkValidCuts(n: Int, rectangles: Array<IntArray>): Boolean = listOf(true, false).any { isX -> rectangles.sortedBy { if (isX) it[0] else it[1] }.fold(0 to 0) { (cnt, end), r -> if ((if (isX) r[0] else r[1]) >= end) (cnt + 1) to (if (isX) r[2] else r[3]) else cnt to maxOf(end, if (isX) r[2] else r[3]) }.first >= 3 }