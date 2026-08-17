/*
 * @lc app=leetcode id=1780 lang=kotlin
 *
 * [1780] Check if Number is a Sum of Powers of Three
 */
class Solution { fun checkPowersOfThree(n: Int): Boolean = !n.toString(3).contains('2') }