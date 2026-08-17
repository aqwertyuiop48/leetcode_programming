/*
 * @lc app=leetcode id=3285 lang=java
 *
 * [3285] Find Indices of Stable Mountains
 */

class Solution {
    fun stableMountains(height: IntArray, threshold: Int): List<Int> = (1 until height.size).filter { height[it - 1] > threshold }
}