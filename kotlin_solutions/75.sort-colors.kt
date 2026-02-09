/*
 * @lc app=leetcode id=75 lang=kotlin
 *
 * [75] Sort Colors
 */

class Solution { fun sortColors(nums: IntArray): Unit = nums.fold(Triple(0, 0, 0)) { (z, o, t), it -> when (it) { 0 -> {Triple(z + 1, o, t)} 1 -> {Triple(z, o + 1, t)} else -> {Triple(z, o, t + 1)} } }.let { (z, o, t) -> (0 until z).forEach { nums[it] = 0 } .also { (z until z + o).forEach { nums[it] = 1 } } .also { (z + o until z + o + t).forEach { nums[it] = 2 } } } }

