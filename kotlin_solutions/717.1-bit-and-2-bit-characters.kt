/*
 * @lc app=leetcode id=717 lang=kotlin
 *
 * [717] 1-bit and 2-bit Characters
 */

class Solution { fun isOneBitCharacter(bits: IntArray): Boolean = generateSequence(0) { i -> if (i < bits.lastIndex) if (bits[i] == 1) i + 2 else i + 1 else null }.last() == bits.lastIndex }
