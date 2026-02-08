/*
 * @lc app=leetcode id=16 lang=kotlin
 *
 * [16] 3Sum Closest
 */

// @lc code=start
class Solution {fun threeSumClosest(nums: IntArray, target: Int) = nums.apply { sort() }.run { (0 until size - 2).asSequence().flatMap { i -> generateSequence(i + 1 to lastIndex) { (j, k) -> if (j < k) (if (this[i] + this[j] + this[k] < target) j + 1 else j) to (if (this[i] + this[j] + this[k] < target) k else k - 1) else null }.takeWhile { (j, k) -> j < k }.map { (j, k) -> this[i] + this[j] + this[k] } }.toList().minByOrNull { kotlin.math.abs(it - target) } ?: this[0] + this[1] + this[2] }}
// @lc code=end

