/*
 * @lc app=leetcode id=2943 lang=kotlin
 *
 * [2943] Maximize Area of Square Hole in Grid
 */

class Solution {
    fun maximizeSquareHoleArea(n: Int, m: Int, hBars: IntArray, vBars: IntArray): Int = minOf(hBars.sorted().let { s -> s.indices.fold(1 to 1) { (mx, cur), i -> if (i > 0 && s[i] == s[i - 1] + 1) maxOf(mx, cur + 1) to (cur + 1) else mx to 1 }.first }, vBars.sorted().let { s -> s.indices.fold(1 to 1) { (mx, cur), i -> if (i > 0 && s[i] == s[i - 1] + 1) maxOf(mx, cur + 1) to (cur + 1) else mx to 1 }.first }).let { (it + 1) * (it + 1) }
}