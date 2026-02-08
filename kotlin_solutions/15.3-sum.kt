/*
 * @lc app=leetcode id=15 lang=kotlin
 *
 * [15] 3Sum
 */

// @lc code=start
class Solution { fun twoSum(nums: IntArray, target: Int) = nums.indices.fold(mutableMapOf<Int, Int>()) { hash, i -> if (hash.containsKey(target - nums[i])) return intArrayOf(hash[target - nums[i]]!!, i) else hash.apply { put(nums[i], i) } }.let { intArrayOf() }fun threeSum(nums: IntArray) = nums.sorted().let { sorted -> (0 until sorted.size - 2).flatMap { i -> if (i > 0 && sorted[i] == sorted[i - 1]) emptyList() else sorted.drop(i + 1).foldIndexed(mutableMapOf<Int, Int>() to mutableListOf<List<Int>>()) { j, (seen, results), num -> (seen.apply { if (containsKey(-sorted[i] - num)) results.add(listOf(sorted[i], -sorted[i] - num, num)) }.apply { put(num, j) }) to results }.second }.toSet().toList() } }
// @lc code=end

