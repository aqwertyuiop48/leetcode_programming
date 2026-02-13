/*
 * @lc app=leetcode id=344 lang=kotlin
 *
 * [344] Reverse String
 */

class Solution {fun reverseString(s: CharArray): Unit = (0 until s.size / 2).forEach { i -> s[i] = s[s.size - 1 - i].also { s[s.size - 1 - i] = s[i] } }}