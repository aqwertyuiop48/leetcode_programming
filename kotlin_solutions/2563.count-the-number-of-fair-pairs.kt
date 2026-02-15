/*
 * @lc app=leetcode id=2563 lang=kotlin
 *
 * [2563] Count the Number of Fair Pairs
 */

class Solution {fun countFairPairs(nums: IntArray, lower: Int, upper: Int) = if (nums.size == 1) 0L else nums.apply { sort() }.indices.fold(0L to (TreeMap<Int, Int>() to TreeMap<Int, Int>())) { (count, maps), i -> maps.let { (map1, map2) -> map1.apply { putIfAbsent(nums[i], i) } to map2.apply { put(nums[i], i) } }.let { (map1, map2) -> (count + (map2.ceilingKey(lower - nums[i])?.let { l -> map2.floorKey(upper - nums[i])?.takeIf { r -> l <= r }?.let { r -> map2[r]!! - map1[l]!! + if (map2[r] != i) 1 else 0 } } ?: 0)) to (map1 to map2) } }.first}
