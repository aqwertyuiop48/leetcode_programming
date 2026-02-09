/*
 * @lc app=leetcode id=90 lang=kotlin
 *
 * [90] Subsets II
 */

class Solution { fun subsetsWithDup(nums: IntArray): List<List<Int>> = nums.sorted().let { sorted -> sorted.foldIndexed(listOf(listOf<Int>()) to 0) { i, (acc, lastSize), num -> (if (i > 0 && sorted[i] == sorted[i - 1]) acc.takeLast(lastSize) else acc).let { subsets -> (acc + subsets.map { it + num }) to subsets.size } }.first } }