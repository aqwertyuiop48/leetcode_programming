/*
 * @lc app=leetcode id=565 lang=kotlin
 *
 * [565] Array Nesting
 */

class Solution { fun arrayNesting(nums: IntArray): Int = BooleanArray(nums.size).let { visited -> nums.indices.maxOf { start -> generateSequence(start.takeUnless { visited[it] }) { current -> nums[current].also { visited[current] = true }.takeUnless { visited[it] } }.count() } } }
