/*
 * @lc app=leetcode id=1720 lang=kotlin
 *
 * [1720] Decode XORed Array
 */

class Solution { fun decode(encoded: IntArray, first: Int): IntArray = IntArray(encoded.size + 1).also { it[0] = first }.also { arr -> encoded.forEachIndexed { i, v -> arr[i + 1] = arr[i] xor v } } }