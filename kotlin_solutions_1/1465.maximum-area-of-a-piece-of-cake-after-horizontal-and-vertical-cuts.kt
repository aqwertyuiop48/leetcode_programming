/*
 * @lc app=leetcode id=1465 lang=kotlin
 *
 * [1465] Maximum Area of a Piece of Cake After Horizontal and Vertical Cuts
 */

class Solution {
    fun maxArea(h: Int, w: Int, hc: IntArray, vc: IntArray): Int = ((listOf(0) + hc.sorted() + listOf(h)).zipWithNext { a, b -> (b - a).toLong() }.maxOrNull()!! * (listOf(0) + vc.sorted() + listOf(w)).zipWithNext { a, b -> (b - a).toLong() }.maxOrNull()!! % 1000000007).toInt()
}