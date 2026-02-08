/*
 * @lc app=leetcode id=42 lang=kotlin
 *
 * [42] Trapping Rain Water
 */

class Solution {fun trap(height: IntArray): Int = height.runningReduce(::maxOf).zip(height.reversed().runningReduce(::maxOf).reversed()).mapIndexed { i, (l, r) -> minOf(l, r) - height[i] }.sum()}

