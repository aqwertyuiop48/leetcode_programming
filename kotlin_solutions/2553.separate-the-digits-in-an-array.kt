/*
 * @lc app=leetcode id=2553 lang=kotlin
 *
 * [2553] Separate the Digits in an Array
 */

class Solution {fun separateDigits(n: IntArray) = n.joinToString("").map { it-'0' }}
