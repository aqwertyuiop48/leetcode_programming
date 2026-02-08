/*
 * @lc app=leetcode id=26 lang=kotlin
 *
 * [26] Remove Duplicates from Sorted Array
 */

// @lc code=start
class Solution { fun removeDuplicates(nums: IntArray): Int = (1 until nums.size).fold(1) { count, i -> (nums[i] != nums[i - 1]).let { isDifferent -> if (isDifferent) count.also { nums[it] = nums[i] } + 1 else count } } }
// @lc code=end

