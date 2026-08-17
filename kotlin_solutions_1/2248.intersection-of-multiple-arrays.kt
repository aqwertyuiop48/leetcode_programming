/*
 * @lc app=leetcode id=2248 lang=kotlin
 *
 * [2248] Intersection of Multiple Arrays
 */

class Solution { fun intersection(nums: Array<IntArray>): List<Int> = nums.map { it.toSet() }.reduce { a, b -> a.intersect(b) }.sorted() }