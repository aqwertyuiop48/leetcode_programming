/*
 * @lc app=leetcode id=1673 lang=kotlin
 *
 * [1673] Find the Most Competitive Subsequence
 */

class Solution { fun mostCompetitive(nums: IntArray, k: Int): IntArray = IntArray(k).also { st -> nums.foldIndexed(0) { i, top, x -> generateSequence(top) { if (it > 0 && st[it - 1] > x && it - 1 + nums.size - i >= k) it - 1 else null }.last().let { t -> if (t < k) (t + 1).also { st[t] = x } else t } } } }