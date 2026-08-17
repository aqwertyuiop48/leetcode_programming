/*
 * @lc app=leetcode id=996 lang=kotlin
 *
 * [996] Number of Squareful Arrays
 */

class Solution {
    fun numSquarefulPerms(A: IntArray): Int = A.sorted().let { nums -> DeepRecursiveFunction<Triple<Int, Int, Int>, Int> { (last, count, mask) -> if (count == nums.size) 1 else nums.indices.fold(0 to -1) { (sum, prev), i -> if ((mask and (1 shl i)) == 0 && (prev == -1 || nums[i] != nums[prev]) && (count == 0 || Math.sqrt((last + nums[i]).toDouble()).toInt().let { r -> r * r == last + nums[i] })) (sum + callRecursive(Triple(nums[i], count + 1, mask or (1 shl i)))) to nums[i] else sum to prev }.first }.invoke(Triple(-1, 0, 0)) }
}