/*
 * @lc app=leetcode id=2496 lang=kotlin
 *
 * [2496] Maximum Value of a String in an Array
 */

class Solution {fun maximumValue(strs: Array<String>) = strs.maxOf { it.toIntOrNull() ?: it.length }}

