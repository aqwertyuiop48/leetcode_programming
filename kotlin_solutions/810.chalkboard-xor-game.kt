/*
 * @lc app=leetcode id=810 lang=kotlin
 *
 * [810] Chalkboard XOR Game
 */

class Solution { fun xorGame(nums: IntArray): Boolean { return nums.reduce { x, y -> x xor y } == 0 || (nums.size and 1 == 0) } }
