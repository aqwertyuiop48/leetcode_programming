/*
 * @lc app=leetcode id=3280 lang=java
 *
 * [3280] Convert Date to Binary
 */

class Solution {
    fun convertDateToBinary(date: String): String = date.split("-").joinToString("-") { it.toInt().toString(2) }
}