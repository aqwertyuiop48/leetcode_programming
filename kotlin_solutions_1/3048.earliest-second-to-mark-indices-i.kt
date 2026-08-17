/*
 * @lc app=leetcode id=3048 lang=kotlin
 *
 * [3048] Earliest Second to Mark Indices I
 */

class Solution { fun earliestSecondToMarkIndices(nums: IntArray, changeIndices: IntArray): Int = (1..changeIndices.size).firstOrNull { s -> IntArray(nums.size + 1) { -1 }.also { last -> (0 until s).forEach { i -> last[changeIndices[i]] = i } }.let { last -> last.drop(1).all { it != -1 } && (0 until s).fold(0 to true) { (power, ok), i -> if (!ok) 0 to false else if (last[changeIndices[i]] == i) nums[changeIndices[i] - 1].let { req -> if (power >= req) (power - req) to true else 0 to false } else (power + 1) to true }.second } } ?: -1 }