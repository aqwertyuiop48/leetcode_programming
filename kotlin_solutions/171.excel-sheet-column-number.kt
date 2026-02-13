/*
 * @lc app=leetcode id=171 lang=kotlin
 *
 * [171] Excel Sheet Column Number
 */

class Solution {fun titleToNumber(title: String): Int =title.fold(0) { acc, c -> acc * 26 + c.toInt() - 64 }}
