/*
 * @lc app=leetcode id=693 lang=kotlin
 *
 * [693] Binary Number with Alternating Bits
 */

class Solution { fun hasAlternatingBits(n: Int): Boolean = generateSequence(n to -1) { (num, last) -> (num shr 1).let { it to (num and 1) }.takeIf { num > 0 } }.drop(1).all { (num, last) -> (num and 1) != last } }
