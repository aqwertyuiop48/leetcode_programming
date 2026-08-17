/*
 * @lc app=leetcode id=1438 lang=kotlin
 *
 * [1438] Longest Continuous Subarray With Absolute Diff Less Than or Equal to Limit
 */

class Solution { fun longestSubarray(nums: IntArray, limit: Int): Int = nums.indices.fold(Pair(java.util.ArrayDeque<Int>(), java.util.ArrayDeque<Int>()) to intArrayOf(0, 0)) { (deques, state), r -> deques.first.also { while (!it.isEmpty() && it.peekLast() < nums[r]) it.pollLast() }.also { it.addLast(nums[r]) }.let { deques.second.also { while (!it.isEmpty() && it.peekLast() > nums[r]) it.pollLast() }.also { it.addLast(nums[r]) } }.let { deques }.also { (maxDq, minDq) -> while (maxDq.peekFirst() - minDq.peekFirst() > limit) (if (maxDq.peekFirst() == nums[state[0]]) maxDq.pollFirst() else null).let { if (minDq.peekFirst() == nums[state[0]]) minDq.pollFirst() }.also { state[0]++ } }.also { state[1] = maxOf(state[1], r - state[0] + 1) }.let { deques to state } }.second[1] }