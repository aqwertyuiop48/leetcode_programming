/*
 * @lc app=leetcode id=264 lang=kotlin
 *
 * [264] Ugly Number II
 */

class Solution {fun nthUglyNumber(n: Int) = generateSequence(Triple(mutableListOf(1), listOf(0, 0, 0), 1)) { (uglyNumbers, pointers, count) -> if (count >= n) null else pointers.let { p -> listOf(uglyNumbers[p[0]] * 2, uglyNumbers[p[1]] * 3, uglyNumbers[p[2]] * 5).minOrNull()!!.let { nextUgly -> Triple(uglyNumbers.apply { add(nextUgly) }, listOf(if (nextUgly == uglyNumbers[p[0]] * 2) p[0] + 1 else p[0], if (nextUgly == uglyNumbers[p[1]] * 3) p[1] + 1 else p[1], if (nextUgly == uglyNumbers[p[2]] * 5) p[2] + 1 else p[2]), count + 1) } } }.last().first.last()}
