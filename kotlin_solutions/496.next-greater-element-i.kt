/*
 * @lc app=leetcode id=496 lang=kotlin
 *
 * [496] Next Greater Element I
 */

class Solution { fun nextGreaterElement(nums1: IntArray, nums2: IntArray): IntArray = nums1.withIndex().associate { it.value to it.index }.let { map -> IntArray(nums1.size) { -1 }.also { ans -> nums2.fold(mutableListOf<Int>()) { stack, num -> generateSequence { stack.lastOrNull()?.takeIf { it < num }?.let { stack.removeLast() } } .forEach { popped -> map[popped]?.let { idx -> ans[idx] = num } } .run{stack.apply { add(num) }} } } } }
