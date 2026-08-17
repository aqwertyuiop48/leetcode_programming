/* @lc app=leetcode id=2429 lang=kotlin */
class Solution {
    fun minimizeXor(num1: Int, num2: Int): Int = Integer.bitCount(num2).let { c2 -> (31 downTo 0).fold(0 to c2) { (x, c), i -> if (c > 0 && (num1 and (1 shl i) != 0)) (x or (1 shl i)) to (c - 1) else x to c }.let { (x1, c1) -> (0..31).fold(x1 to c1) { (x, c), i -> if (c > 0 && (x and (1 shl i) == 0)) (x or (1 shl i)) to (c - 1) else x to c }.first } }
}