/*
 * @lc app=leetcode id=1784 lang=kotlin
 *
 * [1784] Check if Binary String Has at Most One Segment of Ones
 */
class Solution { fun checkOnesSegment(s: String): Boolean = !s.contains("01") }