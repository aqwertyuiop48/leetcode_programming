/*
 * @lc app=leetcode id=773 lang=kotlin
 *
 * [773] Sliding Puzzle
 */

class Solution {fun slidingPuzzle(board: Array<IntArray>) = DeepRecursiveFunction<Triple<String, Int, MutableMap<String, Int>>, Int> { (c, d, v) -> if (c == "123450") d else if (v[c]?.let { it <= d } == true) Int.MAX_VALUE else v.apply { this[c] = d }.run { arrayOf(arrayOf(1, 3), arrayOf(0, 2, 4), arrayOf(1, 5), arrayOf(0, 4), arrayOf(1, 3, 5), arrayOf(2, 4))[c.indexOf('0')].map { i -> c.toCharArray().apply { this[c.indexOf('0')] = this[i].also { this[i] = this[c.indexOf('0')] } }.run { callRecursive(Triple(joinToString(""), d + 1, v)) } }.minOrNull() ?: Int.MAX_VALUE } }(Triple(board.flatMap { it.toList() }.joinToString(""), 0, mutableMapOf())).let { if (it == Int.MAX_VALUE) -1 else it }}
