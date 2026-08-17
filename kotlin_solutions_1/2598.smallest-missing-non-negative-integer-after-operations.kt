/* @lc app=leetcode id=2598 lang=kotlin */
class Solution {
    fun findSmallestInteger(nums: IntArray, value: Int): Int = IntArray(value).also { f -> nums.forEach { f.set((it % value + value) % value, f[(it % value + value) % value] + 1) } }.let { f -> generateSequence(0) { it + 1 }.first { f[it % value].also { f.set(it % value, it - 1) } == 0 } }
}