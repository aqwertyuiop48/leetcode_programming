/*
 * @lc app=leetcode id=1425 lang=kotlin
 *
 * [1425] Constrained Subsequence Sum
 */

class Solution { fun constrainedSubsetSum(nums: IntArray, k: Int): Int = nums.indices.fold(Pair(java.util.ArrayDeque<IntArray>(), Int.MIN_VALUE)) { (dq, maxVal), i -> dq.also { while (!it.isEmpty() && it.peekFirst()[1] < i - k) it.pollFirst() }.let { dq -> (nums[i] + (dq.peekFirst()?.get(0)?.coerceAtLeast(0) ?: 0)).let { cur -> dq.also { while (!it.isEmpty() && it.peekLast()[0] <= cur) it.pollLast() }.also { it.addLast(intArrayOf(cur, i)) }.let { Pair(dq, maxOf(maxVal, cur)) } } } }.second }