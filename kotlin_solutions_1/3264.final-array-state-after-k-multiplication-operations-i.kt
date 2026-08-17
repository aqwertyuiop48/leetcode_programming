/*
 * @lc app=leetcode id=3264 lang=java
 *
 * [3264] Final Array State After K Multiplication Operations I
 */
class Solution { fun getFinalState(nums: IntArray, k: Int, multiplier: Int): IntArray = (1..k).fold(nums) { a, _ -> a.apply { a.indices.minBy { a[it] }.let { a[it] *= multiplier } } } }