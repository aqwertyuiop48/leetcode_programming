/*
 * @lc app=leetcode id=3537 lang=kotlin
 *
 * [3537] Fill a Special Grid
 */

class Solution { fun specialGrid(n: Int): Array<IntArray> = (1 shl n).let { size -> Array(size) { r -> IntArray(size) { c -> (0 until n).sumOf { bit -> ((r shr bit) and 1).let { v4 -> ((c shr bit) and 1).let { v5 -> (((1 - v5) shl 1) or (v4 xor (1 - v5))) shl (2 * bit) } } } } } } }