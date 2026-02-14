/*
 * @lc app=leetcode id=434 lang=kotlin
 *
 * [434] Number of Segments in a String
 */

class Solution {fun countSegments(s: String): Int = s.split(" ").count { it.isNotEmpty() }}