/*
 * @lc app=leetcode id=645 lang=kotlin
 *
 * [645] Set Mismatch
 */

class Solution { fun findErrorNums(nums: IntArray): IntArray = nums.groupBy { it }.let { m -> intArrayOf(m.entries.first { it.value.size == 2 }.key, (1..nums.size).first { it !in m }) } }