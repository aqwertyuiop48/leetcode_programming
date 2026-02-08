/*
 * @lc app=leetcode id=18 lang=kotlin
 *
 * [18] 4Sum
 */

// @lc code=start
class Solution { fun fourSum(nums: IntArray, target: Int): List<List<Int>> = nums.sorted().let { arr -> (0 until arr.size - 3).filter { i -> i == 0 || arr[i] != arr[i - 1] }.flatMap { i -> (i + 1 until arr.size - 2).filter { j -> j == i + 1 || arr[j] != arr[j - 1] }.flatMap { j -> generateSequence(Triple(j + 1, arr.size - 1, listOf<List<Int>>())) { (left, right, acc) -> (left < right).takeIf { it }?.let { (arr[i].toLong() + arr[j] + arr[left] + arr[right]).let { sum -> when { sum == target.toLong() -> { generateSequence(left + 1) { l -> (l < right && arr[l] == arr[l - 1]).takeIf { it }?.let { l + 1 } }.last().let { newLeft -> generateSequence(right - 1) { r -> (r > newLeft && arr[r] == arr[r + 1]).takeIf { it }?.let { r - 1 } }.last().let { newRight -> Triple(newLeft, newRight, acc + listOf(listOf(arr[i], arr[j], arr[left], arr[right]))) } } }sum > target.toLong() -> Triple(left, right - 1, acc) else -> Triple(left + 1, right, acc) } } } }.last().third } } } }
// @lc code=end

