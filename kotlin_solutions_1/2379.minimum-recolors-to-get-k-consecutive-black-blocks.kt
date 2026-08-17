/* @lc app=leetcode id=2379 lang=kotlin */
class Solution { fun minimumRecolors(blocks: String, k: Int): Int = (0..blocks.length - k).minOf { i -> blocks.substring(i, i + k).count { it == 'W' } } }