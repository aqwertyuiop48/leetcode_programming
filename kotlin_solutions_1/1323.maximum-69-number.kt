/*
 * @lc app=leetcode id=1323 lang=kotlin
 *
 * [1323] Maximum 69 Number
 */

class Solution { fun maximum69Number(num: Int): Int = "$num".replaceFirst('6', '9').toInt() }