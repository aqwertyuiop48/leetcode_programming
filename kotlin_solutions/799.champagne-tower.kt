/*
 * @lc app=leetcode id=799 lang=kotlin
 *
 * [799] Champagne Tower
 */

class Solution { fun champagneTower(poured: Int, query_row: Int, query_glass: Int): Double = (0 until query_row).fold(DoubleArray(query_row + 1).apply { this[0] = poured.toDouble() }) { dp, rowIndex -> (0..rowIndex + 1).fold(0.0 to dp) { (remainsOverflow, arr), i -> maxOf(0.0, (arr[i] - 1) / 2).let { halfOverflow -> (halfOverflow to arr.apply { this[i] = halfOverflow + remainsOverflow }) } }.second }[query_glass].coerceAtMost(1.0) }