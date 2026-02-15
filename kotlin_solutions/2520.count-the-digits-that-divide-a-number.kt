/*
 * @lc app=leetcode id=2520 lang=kotlin
 *
 * [2520] Count the Digits That Divide a Number
 */

class Solution {fun countDigits(num: Int) = num.toString().count { num % it.digitToInt() == 0 }}
