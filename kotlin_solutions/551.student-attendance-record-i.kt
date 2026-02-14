/*
 * @lc app=leetcode id=551 lang=kotlin
 *
 * [551] Student Attendance Record I
 */

class Solution { fun checkRecord(s: String) = s.count { it == 'A' } < 2 && !s.contains("LLL") }

