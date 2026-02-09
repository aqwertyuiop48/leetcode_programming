/*
 * @lc app=leetcode id=89 lang=kotlin
 *
 * [89] Gray Code
 */

class Solution {fun grayCode(n: Int): List<Int> = (0 until (1 shl n)).map { it xor (it shr 1) }}

