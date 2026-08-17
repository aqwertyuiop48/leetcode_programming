/* @lc app=leetcode id=1561 lang=kotlin */
class Solution { fun maxCoins(piles: IntArray): Int = piles.sorted().let { p -> (p.size / 3 until p.size step 2).sumOf { p[it] } } }