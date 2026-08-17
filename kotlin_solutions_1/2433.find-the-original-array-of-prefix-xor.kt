/*
 * @lc app=leetcode id=2433 lang=kotlin
 *
 * [2433] Find The Original Array of Prefix Xor
 */
class Solution { fun findArray(pref: IntArray): IntArray = IntArray(pref.size) { i -> if (i == 0) pref[0] else pref[i] xor pref[i - 1] } }