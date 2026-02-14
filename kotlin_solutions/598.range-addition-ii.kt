/*
 * @lc app=leetcode id=598 lang=kotlin
 *
 * [598] Range Addition II
 */

class Solution { fun maxCount(m: Int, n: Int, ops: Array<IntArray>): Int = ops.fold(m to n) { (minA, minB), op -> minOf(minA, op[0]) to minOf(minB, op[1]) }.run { first * second } }

