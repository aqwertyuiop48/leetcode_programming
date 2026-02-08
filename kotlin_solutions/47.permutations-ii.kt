/*
 * @lc app=leetcode id=47 lang=kotlin
 *
 * [47] Permutations II
 */

class Solution { fun permuteUnique(nums: IntArray) = mutableSetOf<List<Int>>().run { DeepRecursiveFunction<Pair<Int, MutableList<Int>>, Unit> { (bitMask, temp) -> if (temp.size == nums.size) add(temp.toList()) else nums.indices.forEach { i -> (bitMask and (1 shl i) == 0).takeIf { it }?.let { callRecursive((bitMask or (1 shl i)) to (temp + nums[i]).toMutableList()) } } }.invoke(0 to mutableListOf()).let { this.toList() } } }