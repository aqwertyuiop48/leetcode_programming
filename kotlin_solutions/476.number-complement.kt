/*
 * @lc app=leetcode id=476 lang=kotlin
 *
 * [476] Number Complement
 */

class Solution { fun findComplement(num: Int): Int = num.takeHighestOneBit().let { highBit -> (highBit shl 1) - 1 xor num } }

