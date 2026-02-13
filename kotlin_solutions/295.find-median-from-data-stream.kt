/*
 * @lc app=leetcode id=295 lang=kotlin
 *
 * [295] Find Median from Data Stream
 */

class MedianFinder(val nums: ArrayList<Double> = ArrayList()) {fun addNum(num: Int) = if (nums.isEmpty()) nums.add(num.toDouble()).let { } else generateSequence(0 to nums.lastIndex) { (left, right) -> if (left > right) null else ((left + right) / 2).let { m -> if (num < nums[m]) left to (m - 1) else (m + 1) to right } }.last().first.let { left -> nums.add(left, num.toDouble()) }fun findMedian() = if (nums.isEmpty()) 0.0 else (nums.size / 2).let { m -> if (nums.size % 2 == 0) (nums[m] + nums[m - 1]) / 2 else nums[m] }}