/*
 * @lc app=leetcode id=805 lang=kotlin
 *
 * [805] Split Array With Same Average
 */

class Solution { fun splitArraySameAverage(nums: IntArray): Boolean = nums.sum().let { sum -> Array(nums.size / 2 + 1) { LinkedHashSet<Int>() }.apply { this[0].add(0) }.let { possibleSums -> nums.fold(possibleSums) { sums, num -> sums.also { (sums.size - 2 downTo 0).forEach { size -> sums[size].toList().forEach { possibleSum -> sums[size + 1].add(possibleSum + num) } } } }.let { finalSums -> (1..nums.size / 2).any { smallSize -> (sum * smallSize).let { temp -> temp % nums.size == 0 && finalSums[smallSize].contains(temp / nums.size) } } } } } }