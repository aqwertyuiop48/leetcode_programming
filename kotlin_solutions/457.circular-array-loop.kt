/*
 * @lc app=leetcode id=457 lang=kotlin
 *
 * [457] Circular Array Loop
 */

class Solution { fun circularArrayLoop(nums: IntArray): Boolean = nums.indices.any { start -> generateSequence(start to ((start + nums[start]).mod(nums.size).takeIf { it != start && (nums[start] >= 0) == (nums[it] >= 0) } ?: -1)) { (slow, fast) -> if (slow == -1 || fast == -1 || slow == fast) null else ((slow + nums[slow]).mod(nums.size).takeIf { it != slow && (nums[slow] >= 0) == (nums[it] >= 0) } ?: -1).let { newSlow -> ((fast + nums[fast]).mod(nums.size).takeIf { it != fast && (nums[fast] >= 0) == (nums[it] >= 0) } ?: -1).let { temp -> (temp.takeIf { it != -1 }?.let { (it + nums[it]).mod(nums.size).takeIf { n -> n != it && (nums[it] >= 0) == (nums[n] >= 0) } } ?: -1).let { newFast -> newSlow to newFast } } } }.lastOrNull()?.let { (s, f) -> s == f && s != -1 } ?: false } }