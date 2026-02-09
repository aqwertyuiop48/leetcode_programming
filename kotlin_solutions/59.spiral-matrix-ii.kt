/*
 * @lc app=leetcode id=59 lang=kotlin
 *
 * [59] Spiral Matrix II
 */

class Solution { fun generateMatrix(n: Int): Array<IntArray> = Array(n) { IntArray(n) }.apply { intArrayOf(-1, 0, 1, 1).also { s -> repeat(n) { i -> repeat(n - i) { this[s[1]][s[0] + s[2]] = s[3]++.also { s[0] += s[2] } }.also { repeat(n - i - 1) { this[s[1] + s[2]][s[0]] = s[3]++.also { s[1] += s[2] } } }.also { s[2] = -s[2] } } } } }

