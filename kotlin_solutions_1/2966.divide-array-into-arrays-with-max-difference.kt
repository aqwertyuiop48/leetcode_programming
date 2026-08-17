/*
 * @lc app=leetcode id=2966 lang=kotlin
 *
 * [2966] Divide Array Into Arrays With Max Difference
 */

class Solution { fun divideArray(nums: IntArray, k: Int): Array<IntArray> = nums.sorted().let { s -> if ((0 until s.size step 3).all { s[it + 2] - s[it] <= k }) Array(s.size / 3) { i -> intArrayOf(s[i * 3], s[i * 3 + 1], s[i * 3 + 2]) } else arrayOf() } }