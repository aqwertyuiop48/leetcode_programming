/*
 * @lc app=leetcode id=3011 lang=kotlin
 *
 * [3011] Find if Array Can Be Sorted
 */

class Solution { fun canSortArray(nums: IntArray): Boolean = nums.fold(mutableListOf<Triple<Int, Int, Int>>()) { acc, x -> if (acc.isNotEmpty() && acc.last().third == x.countOneBits()) acc.also { it[it.lastIndex] = Triple(minOf(it.last().first, x), maxOf(it.last().second, x), x.countOneBits()) } else acc.also { it.add(Triple(x, x, x.countOneBits())) } }.zipWithNext().all { (prev, curr) -> prev.second <= curr.first } }