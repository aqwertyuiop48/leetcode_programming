/*
 * @lc app=leetcode id=1663 lang=kotlin
 *
 * [1663] Smallest String With A Given Numeric Value
 */

class Solution { fun getSmallestString(n: Int, k: Int): String = "a".repeat(n - (k - n) / 25 - if ((k - n) % 25 == 0) 0 else 1) + (if ((k - n) % 25 == 0) "" else ('a' + (k - n) % 25).toString()) + "z".repeat((k - n) / 25) }