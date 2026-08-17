/*
 * @lc app=leetcode id=1837 lang=kotlin
 *
 * [1837] Sum of Digits in Base K
 */

class Solution { fun sumBase(n: Int, k: Int): Int = n.toString(k).sumOf { it - '0' } }