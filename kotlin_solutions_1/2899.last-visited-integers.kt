/*
 * @lc app=leetcode id=2899 lang=kotlin
 *
 * [2899] Last Visited Integers
 */

class Solution {
    fun lastVisitedIntegers(nums: List<Int>): List<Int> = nums.fold(Triple(mutableListOf<Int>(), 0, mutableListOf<Int>())) { (seen, k, ans), num -> if (num > 0) Triple(seen.also { it.add(0, num) }, 0, ans) else (k + 1).let { newK -> Triple(seen, newK, ans.also { it.add(if (newK <= seen.size) seen[newK - 1] else -1) }) } }.third
}