/*
 * @lc app=leetcode id=169 lang=kotlin
 *
 * [169] Majority Element
 */

class Solution {fun majorityElement(ar: IntArray) = ar.find { n -> ar.count { it == n } > ar.size / 2 }}

