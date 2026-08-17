/*
 * @lc app=leetcode id=3206 lang=kotlin
 *
 * [3206] Alternating Groups I
 */
class Solution { fun numberOfAlternatingGroups(colors: IntArray): Int = colors.indices.count { i -> colors[i] != colors[(i + 1) % colors.size] && colors[(i + 1) % colors.size] != colors[(i + 2) % colors.size] } }