/*
 * @lc app=leetcode id=3318 lang=java
 *
 * [3318] Find X-Sum of All K-Long Subarrays I
 */
fun findXSum(nums: IntArray, k: Int, x: Int): IntArray = IntArray(nums.size - k + 1) { i -> (i until i + k).map { nums[it] }.groupingBy { it }.eachCount().entries.sortedWith(compareByDescending<Map.Entry<Int, Int>> { it.value }.thenByDescending { it.key }).take(x).sumOf { it.key * it.value } }