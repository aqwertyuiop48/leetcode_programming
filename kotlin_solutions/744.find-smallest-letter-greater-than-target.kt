/*
 * @lc app=leetcode id=744 lang=kotlin
 *
 * [744] Find Smallest Letter Greater Than Target
 */

class Solution { fun nextGreatestLetter(letters: CharArray, target: Char): Char = letters.firstOrNull { it > target } ?: letters.first() }
