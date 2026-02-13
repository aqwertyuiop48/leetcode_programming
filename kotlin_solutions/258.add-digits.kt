/*
 * @lc app=leetcode id=258 lang=kotlin
 *
 * [258] Add Digits
 */

class Solution {fun addDigits(num: Int): Int = if (num < 10) num else addDigits((num / 10) + (num % 10))}

