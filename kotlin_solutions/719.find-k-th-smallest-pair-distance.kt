/*
 * @lc app=leetcode id=719 lang=kotlin
 *
 * [719] Find K-th Smallest Pair Distance
 */

class Solution { fun smallestDistancePair(nums: IntArray, k: Int): Int = nums.apply { sort() }.let { arr -> generateSequence(0 to (arr.last() - arr.first())) { (low, high) -> (low < high).takeIf { it }?.let { (low + (high - low) / 2).let { mid -> arr.indices.sumOf { i -> generateSequence(i + 1) { it + 1 } .takeWhile { it < arr.size && arr[it] - arr[i] <= mid } .count() }.let { count -> if (count >= k) low to mid else (mid + 1) to high } } } }.first { (low, high) -> low >= high }.first } }