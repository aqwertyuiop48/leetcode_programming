/*
 * @lc app=leetcode id=3200 lang=kotlin
 *
 * [3200] Maximum Height of a Triangle
 */
class Solution { fun maxHeightOfTriangle(red: Int, blue: Int): Int = { x: Int, y: Int -> generateSequence(1) { it + 1 }.scan(Triple(x, y, true)) { (r, b, ok), need -> if (!ok) Triple(r, b, false) else if (need % 2 == 1) if (r >= need) Triple(r - need, b, true) else Triple(r, b, false) else if (b >= need) Triple(r, b - need, true) else Triple(r, b, false) }.takeWhile { it.third }.count() - 1 }.let { solve -> maxOf(solve(red, blue), solve(blue, red)) } }