/*
 * @lc app=leetcode id=3289 lang=java
 *
 * [3289] The Two Sneaky Numbers of Digitville
 */

class Solution {
    fun getSneakyNumbers(nums: IntArray): IntArray = nums.groupBy { it }.filter { it.value.size == 2 }.keys.toIntArray()
}