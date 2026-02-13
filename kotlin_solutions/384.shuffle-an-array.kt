/*
 * @lc app=leetcode id=384 lang=kotlin
 *
 * [384] Shuffle an Array
 */

class Solution(private val nums: IntArray) {fun reset(): IntArray = nums fun shuffle(): IntArray = nums.clone().apply { indices.forEach { i -> (i until size).random().let { j -> this[i] = this[j].also { this[j] = this[i] } } } }}
