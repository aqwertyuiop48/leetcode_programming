/*
 * @lc app=leetcode id=3388 lang=java
 *
 * [3388] Count Beautiful Splits in an Array
 */

fun beautifulSplits(nums: IntArray): Int = Array(nums.size + 1) { IntArray(nums.size + 1) }.apply { (nums.size - 1 downTo 0).forEach { i -> (nums.size - 1 downTo i + 1).forEach { j -> if (nums[i] == nums[j]) this[i][j] = 1 + this[i + 1][j + 1] } } }.let { lcp -> (1 until nums.size - 1).sumOf { i -> (i + 1 until nums.size).count { j -> (i <= j - i && lcp[0][i] >= i) || (j - i <= nums.size - j && lcp[i][j] >= j - i) } } }