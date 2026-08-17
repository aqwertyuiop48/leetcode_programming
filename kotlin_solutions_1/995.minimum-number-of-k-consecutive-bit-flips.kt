/*
 * @lc app=leetcode id=995 lang=kotlin
 *
 * [995] Minimum Number of K Consecutive Bit Flips
 */

class Solution {
    fun minKBitFlips(nums: IntArray, k: Int): Int = IntArray(nums.size).let { isFlipped -> intArrayOf(0, 0).also { state -> nums.indices.forEach { i -> if (state[1] != -1) { Unit.also { if (i >= k) state[0] = state[0] xor isFlipped[i - k] }.also { if (nums[i] xor state[0] == 0) { if (i + k > nums.size) state[1] = -1 else Unit.also { isFlipped[i] = 1 }.also { state[0] = state[0] xor 1 }.also { state[1]++ } } } } } }[1] }
}