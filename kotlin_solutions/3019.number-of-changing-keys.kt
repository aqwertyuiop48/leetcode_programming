/*
 * @lc app=leetcode id=3019 lang=kotlin
 *
 * [3019] Number of Changing Keys
 */

class Solution {fun countKeyChanges(s: String) = s.lowercase().zipWithNext().count { (a, b) -> a != b }}
