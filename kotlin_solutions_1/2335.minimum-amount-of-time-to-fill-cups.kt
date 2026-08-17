/* @lc app=leetcode id=2335 lang=kotlin */
class Solution { fun fillCups(amount: IntArray): Int = amount.sorted().let { maxOf(it[2], (it.sum() + 1) / 2) } }