/*
 * @lc app=leetcode id=3536 lang=kotlin
 *
 * [3536] Maximum Product of Two Digits
 */

class Solution { fun maxProduct(n: Int): Int = n.toString().map { it - '0' }.sorted().let { digits -> if (digits.size > 1) digits.last() * digits[digits.size - 2] else 0 } }