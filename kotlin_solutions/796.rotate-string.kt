/*
 * @lc app=leetcode id=796 lang=kotlin
 *
 * [796] Rotate String
 */

class Solution { fun rotateString(s: String, goal: String): Boolean = s.length == goal.length && (s + s).contains(goal) }