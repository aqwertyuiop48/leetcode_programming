/*
 * @lc app=leetcode id=525 lang=kotlin
 *
 * [525] Contiguous Array
 */

class Solution(val mp: HashMap<Int, Int> = HashMap()) { fun findMaxLength(nums: IntArray) = nums.indices.fold(0 to 0) { (sum, subArrayLength), i -> (sum + if (nums[i] == 0) -1 else 1).let { newSum -> newSum to when { newSum == 0 -> {i + 1} mp.containsKey(newSum) -> {maxOf(subArrayLength, i - mp[newSum]!!)} else -> {subArrayLength.also { mp[newSum] = i }} } } }.second }
