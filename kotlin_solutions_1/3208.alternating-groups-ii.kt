/*
 * @lc app=leetcode id=3208 lang=kotlin
 *
 * [3208] Alternating Groups II
 */
class Solution { fun numberOfAlternatingGroups(colors: IntArray, k: Int): Int = colors.size.let { n -> (0 until n + k - 2).fold(1 to 0) { (len, ans), i -> (if (colors[i % n] != colors[(i + 1) % n]) len + 1 else 1).let { newLen -> newLen to (if (newLen >= k) ans + 1 else ans) } }.second } }