/*
 * @lc app=leetcode id=405 lang=kotlin
 *
 * [405] Convert a Number to Hexadecimal
 */

class Solution { fun toHex(num: Int): String = num.toLong().let { if (it < 0) it + (1L shl 32) else it }.let { n -> generateSequence(n) { (it shr 4).takeIf { shifted -> shifted > 0 } } .map { "0123456789abcdef"[(it and 15).toInt()] } .joinToString("") .reversed() .ifEmpty { "0" } } }
