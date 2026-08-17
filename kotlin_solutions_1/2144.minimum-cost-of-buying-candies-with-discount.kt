/* @lc app=leetcode id=2144 lang=kotlin */
class Solution { fun minimumCost(cost: IntArray): Int = cost.sortedDescending().filterIndexed { i, _ -> i % 3 != 2 }.sum() }