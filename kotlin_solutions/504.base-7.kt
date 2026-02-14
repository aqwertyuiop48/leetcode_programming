/*
 * @lc app=leetcode id=504 lang=kotlin
 *
 * [504] Base 7
 */

class Solution { fun convertToBase7(num: Int): String = when (num) { 0 -> {"0"} else -> generateSequence(if (num < 0) -num else num) { it.div(7).takeIf { it != 0 } } .map { it % 7 } .toList() .reversed() .joinToString("") .let { if (num < 0) "-$it" else it } } }