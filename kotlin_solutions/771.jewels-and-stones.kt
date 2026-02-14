/*
 * @lc app=leetcode id=771 lang=kotlin
 *
 * [771] Jewels and Stones
 */

class Solution { fun numJewelsInStones(jewels: String, stones: String): Int = jewels.toSet().let { j -> stones.count { it in j } } }
