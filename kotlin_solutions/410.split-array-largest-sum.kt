/*
 * @lc app=leetcode id=410 lang=kotlin
 *
 * [410] Split Array Largest Sum
 */

class Solution {fun splitArray(nums: IntArray, k: Int): Int = generateSequence(nums.maxOrNull()!! to nums.sum()) { (lo, hi) -> if (lo < hi) ((lo + hi) / 2).let { mid -> if (nums.fold(1 to 0) { (cnt, sum), n -> if (sum + n > mid) cnt + 1 to n else cnt to sum + n }.first <= k) lo to mid else mid + 1 to hi } else null }.last().first}

