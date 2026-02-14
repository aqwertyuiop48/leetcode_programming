/*
 * @lc app=leetcode id=567 lang=kotlin
 *
 * [567] Permutation in String
 */

class Solution { fun checkInclusion(s1: String, s2: String) = s1.let { target -> (0..s2.length - target.length).any { i -> IntArray(26).apply { s2.substring(i, i + target.length).forEach { this[it - 'a']++ } }.contentEquals(IntArray(26).apply { target.forEach { this[it - 'a']++ } }) } } }