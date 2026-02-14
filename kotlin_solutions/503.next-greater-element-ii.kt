/*
 * @lc app=leetcode id=503 lang=kotlin
 *
 * [503] Next Greater Element II
 */

class Solution(val stack: Stack<Pair<Int, Int>> = Stack(), var maxIndex: Int = 0) { fun nextGreaterElements(nums: IntArray) = IntArray(nums.size) { -1 }.also { res -> nums.indices.forEach { if (nums[it] > nums[maxIndex]) maxIndex = it }.run { stack.clear() }.run { ((maxIndex + 1) until nums.size).forEach { i -> generateSequence { stack.takeIf { it.isNotEmpty() && it.peek().second < nums[i] }?.pop()?.also { (index, _) -> res[index] = nums[i] } }.forEach { }.run { stack.push(i to nums[i]) } } }.run { (0..maxIndex).forEach { i -> generateSequence { stack.takeIf { it.isNotEmpty() && it.peek().second < nums[i] }?.pop()?.also { (index, _) -> res[index] = nums[i] } }.forEach { }.run { stack.push(i to nums[i]) } } }.run { generateSequence { stack.takeIf { it.isNotEmpty() }?.pop()?.also { (index, _) -> res[index] = -1 } }.forEach { } } } }
