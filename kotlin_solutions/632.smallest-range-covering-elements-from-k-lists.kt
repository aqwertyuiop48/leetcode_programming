/*
 * @lc app=leetcode id=632 lang=kotlin
 *
 * [632] Smallest Range Covering Elements from K Lists
 */

class Solution { fun smallestRange(nums: List<List<Int>>): IntArray = PriorityQueue<Pair<Int, Int>> { v1, v2 -> nums[v1.first][v1.second] - nums[v2.first][v2.second] } .apply { nums.indices.forEach { add(it to 0) } } .let { heap -> nums.indices.maxByOrNull { nums[it][0] }!!.let { maxIdx -> DeepRecursiveFunction<Triple<PriorityQueue<Pair<Int, Int>>, Pair<Int, Int>, Pair<Int, Int>>, Pair<Int, Int>> { (h, max, range) -> h.poll()?.let { (first, second) -> nums[max.first][max.second].let { maxVal -> nums[first][second].let { minVal -> (maxVal - minVal).let { newR -> (range.second - range.first).let { oldR -> if (newR < oldR || (newR == oldR && minVal < range.first)) minVal to maxVal else range } } } }.let { newRange -> if (second < nums[first].lastIndex) callRecursive(Triple(h.apply { add(first to second + 1) }, if (nums[first][second + 1] > nums[max.first][max.second]) first to second + 1 else max, newRange)) else newRange } } ?: range }(Triple(heap, maxIdx to 0, 0 to Int.MAX_VALUE)) } }.let { intArrayOf(it.first, it.second) } }

