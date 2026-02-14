/*
 * @lc app=leetcode id=593 lang=kotlin
 *
 * [593] Valid Square
 */

class Solution { fun validSquare(p1: IntArray, p2: IntArray, p3: IntArray, p4: IntArray): Boolean = arrayOf(p1, p2, p3, p4).let { points -> (0 until 3).flatMap { i -> (i + 1 until 4).map { j -> points[j].let { pj -> points[i].let { pi -> (pj[0] - pi[0]).let { x -> (pj[1] - pi[1]).let { y -> x * x + y * y } } } } } }.toSet().run { size == 2 && 0 !in this } } }

