/*
 * @lc app=leetcode id=27 lang=kotlin
 *
 * [27] Remove Element
 */

// @lc code=start
class Solution {fun removeElement(nums: IntArray, `val`: Int): Int =nums.indices.fold(0) { i, j -> if (nums[j] != `val`) i.also { nums[it] = nums[j] } + 1 else i }}
// @lc code=end

