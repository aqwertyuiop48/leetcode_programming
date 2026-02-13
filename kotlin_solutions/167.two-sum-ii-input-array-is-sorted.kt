/*
 * @lc app=leetcode id=167 lang=kotlin
 *
 * [167] Two Sum II - Input Array Is Sorted
 */

class Solution { fun twoSum(numbers: IntArray, target: Int): IntArray = generateSequence(0 to numbers.lastIndex) { (left, right) -> when { numbers[left] + numbers[right] < target -> {(left + 1) to right} numbers[left] + numbers[right] > target -> {left to (right - 1)} else -> {null} } }.first { (left, right) -> numbers[left] + numbers[right] == target } .let { (left, right) -> intArrayOf(left + 1, right + 1) } }

