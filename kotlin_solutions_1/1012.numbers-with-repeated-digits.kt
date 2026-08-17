/*
 * @lc app=leetcode id=1012 lang=kotlin
 *
 * [1012] Numbers With Repeated Digits
 */

class Solution {
    fun numDupDigitsAtMostN(n: Int): Int = n.toString().let { s -> n - ((1 until s.length).sumOf { i -> 9 * (0 until i - 1).fold(1) { acc, j -> acc * (9 - j) } } + s.indices.fold(Triple(0, 0, true)) { (mask, count, valid), i -> if (!valid) Triple(mask, count, false) else (s[i] - '0').let { limit -> (((if (i == 0) 1 else 0) until limit).count { d -> (mask and (1 shl d)) == 0 } * (0 until (s.length - 1 - i)).fold(1) { acc, j -> acc * (9 - i - j) }).let { ways -> if ((mask and (1 shl limit)) != 0) Triple(mask, count + ways, false) else Triple(mask or (1 shl limit), count + ways, true) } } }.let { (_, count, valid) -> count + if (valid) 1 else 0 }) }
}