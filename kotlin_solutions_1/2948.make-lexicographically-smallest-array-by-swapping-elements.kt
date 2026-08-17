/*
 * @lc app=leetcode id=2948 lang=kotlin
 *
 * [2948] Make Lexicographically Smallest Array by Swapping Elements
 */

class Solution {
    fun lexicographicallySmallestArray(nums: IntArray, limit: Int): IntArray = nums.copyOf().also { ans -> nums.indices.map { i -> nums[i] to i }.sortedBy { it.first }.let { sorted -> sorted.indices.fold(mutableListOf<MutableList<Pair<Int, Int>>>()) { groups, i -> if (groups.isEmpty() || sorted[i].first - sorted[i - 1].first > limit) groups.also { it.add(mutableListOf(sorted[i])) } else groups.also { it.last().add(sorted[i]) } } }.forEach { group -> group.map { it.second }.sorted().zip(group.map { it.first }) { idx, v -> ans[idx] = v } } }
}