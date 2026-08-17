/* @lc app=leetcode id=2593 lang=kotlin */
class Solution {
    fun findScore(nums: IntArray): Long = BooleanArray(nums.size).let { m -> nums.indices.sortedWith(compareBy({ nums[it] }, { it })).fold(0L) { s, i -> if (!m[i]) (s + nums[i]).also { m.set(i, true).also { if (i > 0) m.set(i - 1, true) else Unit }.also { if (i < nums.size - 1) m.set(i + 1, true) else Unit } } else s } }
}