/*
 * @lc app=leetcode id=324 lang=kotlin
 *
 * [324] Wiggle Sort II
 */

class Solution {fun wiggleSort(nums: IntArray): Unit = IntArray(5001).apply { nums.forEach { this[it]++ } }.let { f -> intArrayOf(0, 5000, 0).let { ptrs -> (nums.size % 2 == 0).let { evenLen -> generateSequence { ptrs[2].takeIf { it < nums.size } }.forEach { c -> if (c % 2 == 0) generateSequence { ptrs[0].takeIf { f[it] == 0 } }.forEach { ptrs[0]++ }.run { nums[if (evenLen) nums.size - 2 - ptrs[2] else nums.size - 1 - ptrs[2]] = ptrs[0].also { f[it]-- }.also { ptrs[2]++ } } else generateSequence { ptrs[1].takeIf { f[it] == 0 } }.forEach { ptrs[1]-- }.run { nums[ptrs[2]] = ptrs[1].also { f[it]-- }.also { ptrs[2]++ } } } } } }}
