/*
 * @lc app=leetcode id=1486 lang=kotlin
 *
 * [1486] XOR Operation in an Array
 */

class Solution { fun xorOperation(n: Int, start: Int): Int = (0 until n).fold(0) { acc, i -> acc xor (start + 2 * i) } }