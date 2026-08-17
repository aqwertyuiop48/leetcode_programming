/*
 * @lc app=leetcode id=2179 lang=kotlin
 *
 * [2179] Count Good Triplets in an Array
 */

class Solution { fun goodTriplets(nums1: IntArray, nums2: IntArray): Long = IntArray(nums1.size).let { pos -> nums1.forEachIndexed { i, x -> pos.set(x, i) }.let { IntArray(nums1.size + 2).let { bit -> kotlin.DeepRecursiveFunction<Int, Unit> { idx -> if (idx < bit.size) bit.set(idx, bit[idx] + 1).also { callRecursive(idx + (idx and -idx)) } else Unit }.let { update -> kotlin.DeepRecursiveFunction<Int, Int> { idx -> if (idx > 0) bit[idx] + callRecursive(idx - (idx and -idx)) else 0 }.let { query -> longArrayOf(0L).let { ans -> nums2.forEachIndexed { i, x -> pos[x].let { idx -> query.invoke(idx).let { left -> ans.set(0, ans[0] + left.toLong() * ((nums1.size - 1 - idx) - (i - left))).also { update.invoke(idx + 1) } } } }.run { ans[0] } } } } } } } }