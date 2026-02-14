/*
 * @lc app=leetcode id=480 lang=kotlin
 *
 * [480] Sliding Window Median
 */

import java.util.* class Solution( private val maxHeap: PriorityQueue<Int> = PriorityQueue<Int>(Collections.reverseOrder()), private val minHeap: PriorityQueue<Int> = PriorityQueue<Int>() ) { fun medianSlidingWindow(nums: IntArray, k: Int): DoubleArray = nums.withIndex().map { (i, num) -> (if (maxHeap.isEmpty() || maxHeap.peek() >= num) maxHeap else minHeap).offer(num).run { when { maxHeap.size > minHeap.size + 1 -> {minHeap.offer(maxHeap.poll())} minHeap.size > maxHeap.size -> {maxHeap.offer(minHeap.poll())} else -> Unit } }.let { if (i >= k - 1) (if (minHeap.size != maxHeap.size) maxHeap.peek().toDouble() else maxHeap.peek() / 2.0 + minHeap.peek() / 2.0).also { nums[i - k + 1].let { toRemove -> (if (maxHeap.peek() >= toRemove) maxHeap else minHeap).remove(toRemove).run { when { maxHeap.size > minHeap.size + 1 -> {minHeap.offer(maxHeap.poll())} minHeap.size > maxHeap.size -> {maxHeap.offer(minHeap.poll())} else -> Unit } } } } else null } }.filterNotNull().toDoubleArray() }
