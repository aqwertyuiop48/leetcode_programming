/*
 * @lc app=leetcode id=3397 lang=java
 *
 * [3397] Maximum Number of Distinct Elements After Operations
 */

fun maxDistinctElements(nums: IntArray, k: Int): Int = nums.sorted().fold(Int.MIN_VALUE to 0) { (last, count), x -> maxOf(last.toLong() + 1, (x - k).toLong()).let { if (it <= x + k) it.toInt() to (count + 1) else last to count } }.second