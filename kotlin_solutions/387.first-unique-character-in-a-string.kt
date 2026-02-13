/*
 * @lc app=leetcode id=387 lang=kotlin
 *
 * [387] First Unique Character in a String
 */

class Solution {fun firstUniqChar(s: String): Int = s.groupingBy { it }.eachCount().let { counts -> s.indexOfFirst { counts[it] == 1 } }}