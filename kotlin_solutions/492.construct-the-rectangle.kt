/*
 * @lc app=leetcode id=492 lang=kotlin
 *
 * [492] Construct the Rectangle
 */

class Solution { fun constructRectangle(area: Int): IntArray = generateSequence(Math.sqrt(area.toDouble()).toInt()) { it - 1 } .first { area % it == 0 }.let { intArrayOf(area / it, it) } }