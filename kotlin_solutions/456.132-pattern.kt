/*
 * @lc app=leetcode id=456 lang=kotlin
 *
 * [456] 132 Pattern
 */

class Solution { fun find132pattern(nums: IntArray): Boolean = IntArray(1) { Int.MIN_VALUE }.let { rightHolder -> nums.reversedArray().fold(mutableListOf<Int>()) { stack, i -> if (i < rightHolder[0]) return true else stack.apply { while (isNotEmpty() && i > last()) rightHolder[0] = removeLast() }.apply { add(i) } }.let { false } } }