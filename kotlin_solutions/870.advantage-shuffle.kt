/*
 * @lc app=leetcode id=870 lang=kotlin
 *
 * [870] Advantage Shuffle
 */

class Solution { fun advantageCount(nums1: IntArray, nums2: IntArray) = PriorityQueue<Pair<Int, Int>>(compareBy { -it.first }).apply { nums2.forEachIndexed { ind, num -> offer(num to ind) } }.let { pq -> nums1.sorted().let { sorted -> generateSequence(0 to sorted.lastIndex to IntArray(nums1.size)) { (range, ans) -> pq.poll()?.let { (max, i) -> if (max < sorted[range.second]) (range.first to range.second - 1) to ans.apply { this[i] = sorted[range.second] } else (range.first + 1 to range.second) to ans.apply { this[i] = sorted[range.first] } } }.last().second } } }

