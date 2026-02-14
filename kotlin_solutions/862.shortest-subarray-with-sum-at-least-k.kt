/*
 * @lc app=leetcode id=862 lang=kotlin
 *
 * [862] Shortest Subarray with Sum at Least K
 */

class Solution { fun shortestSubarray(nums: IntArray, k: Int) = { prefixes: LongArray, k: Int -> prefixes.indices.fold(Int.MAX_VALUE to LinkedList<Int>()) { (r, q), i -> q.run { generateSequence { takeIf { isNotEmpty() && prefixes[i] - prefixes[first()] >= k }?.let { i - pollFirst() } }.fold(r, ::minOf) }.let { newR -> q.apply { generateSequence { takeIf { isNotEmpty() && prefixes[i] <= prefixes[last()] }?.pollLast() }.forEach { } }.also { it.add(i) }.run { newR to q } } }.first.takeIf { it != Int.MAX_VALUE } ?: -1 }(nums.runningFold(0L, Long::plus).toLongArray(), k) }

