/*
 * @lc app=leetcode id=3371 lang=java
 *
 * [3371] Identify the Largest Outlier in an Array
 */

fun getLargestOutlier(nums: IntArray): Int = nums.sum().let { s -> nums.groupingBy { it }.eachCount().let { c -> nums.filter { (s - it) % 2 == 0 && c.getOrDefault((s - it) / 2, 0) > (if ((s - it) / 2 == it) 1 else 0) }.maxOrNull() ?: -1 } }