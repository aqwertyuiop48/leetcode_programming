/*
 * @lc app=leetcode id=1239 lang=kotlin
 *
 * [1239] Maximum Length of a Concatenated String with Unique Characters
 */
class Solution { fun maxLength(arr: List<String>): Int = arr.map { s -> s.fold(0) { m, c -> if (m < 0 || (m and (1 shl (c - 'a'))) != 0) -1 else m or (1 shl (c - 'a')) } }.filter { it > 0 }.fold(listOf(0)) { dp, m -> dp + dp.filter { (it and m) == 0 }.map { it or m } }.maxOf { Integer.bitCount(it) } }