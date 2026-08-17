/*
 * @lc app=leetcode id=2914 lang=kotlin
 *
 * [2914] Minimum Number of Changes to Make Binary String Beautiful
 */

class Solution { fun minChanges(s: String): Int = (0 until s.length step 2).count { s[it] != s[it + 1] } }