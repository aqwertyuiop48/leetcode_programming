/*
 * @lc app=leetcode id=703 lang=kotlin
 *
 * [703] Kth Largest Element in a Stream
 */

class KthLargest(private val k: Int, nums: IntArray, private val minHeap: PriorityQueue<Int> = PriorityQueue<Int>().apply { nums.forEach { add(it).also { if (size > k) poll() } } }) { fun add(`val`: Int): Int = minHeap.apply { add(`val`).also { if (size > k) poll() } }.peek() }
