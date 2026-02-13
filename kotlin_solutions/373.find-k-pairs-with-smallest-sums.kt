/*
 * @lc app=leetcode id=373 lang=kotlin
 *
 * [373] Find K Pairs with Smallest Sums
 */

class Solution {fun kSmallestPairs(nums1: IntArray, nums2: IntArray, k: Int) = if (nums1.isEmpty() || nums2.isEmpty() || k == 0) emptyList() else generateSequence((0 until minOf(nums1.size, k)).fold(PriorityQueue<IntArray>(compareBy { it[0] })) { pq, i -> pq.apply { offer(intArrayOf(nums1[i] + nums2[0], i, 0)) } } to mutableListOf<List<Int>>()) { (pq, res) -> if (pq.isNotEmpty() && res.size < k) pq.poll().let { cur -> pq.apply { if (cur[2] + 1 < nums2.size) offer(intArrayOf(nums1[cur[1]] + nums2[cur[2] + 1], cur[1], cur[2] + 1)) } to res.apply { add(listOf(nums1[cur[1]], nums2[cur[2]])) } } else null }.takeWhile { it != null }.last().second}