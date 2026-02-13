/*
 * @lc app=leetcode id=239 lang=kotlin
 *
 * [239] Sliding Window Maximum
 */

class Solution {fun maxSlidingWindow(nums: IntArray, k: Int): IntArray = PriorityQueue<Pair<Int, Int>>(compareByDescending { it.first }).run { nums.take(k).forEachIndexed { i, v -> add(v to i) }.run { IntArray(nums.size - k + 1) { i -> run { if (i > 0) add(nums[i + k - 1] to (i + k - 1)) }.run { while (peek().second <= i - 1) poll() }.let { peek().first } } } }}
