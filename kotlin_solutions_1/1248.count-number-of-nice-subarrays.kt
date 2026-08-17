/*
 * @lc app=leetcode id=1248 lang=kotlin
 *
 * [1248] Count Number of Nice Subarrays
 */

class Solution { fun numberOfSubarrays(nums: IntArray, k: Int): Int = nums.fold(Triple(0, 0, IntArray(nums.size + 1).also { it[0] = 1 })) { (ans, cur, cnt), x -> (cur + (x and 1)).let { c -> Triple(ans + if (c >= k) cnt[c - k] else 0, c, cnt.also { it[c]++ }) } }.first }