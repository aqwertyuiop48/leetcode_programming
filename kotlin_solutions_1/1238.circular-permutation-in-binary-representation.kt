/*
 * @lc app=leetcode id=1238 lang=kotlin
 *
 * [1238] Circular Permutation in Binary Representation
 */
class Solution { fun circularPermutation(n: Int, start: Int): List<Int> = (0 until (1 shl n)).map { i -> start xor i xor (i shr 1) } }