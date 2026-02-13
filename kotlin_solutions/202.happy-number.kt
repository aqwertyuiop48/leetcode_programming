/*
 * @lc app=leetcode id=202 lang=kotlin
 *
 * [202] Happy Number
 */

class Solution { fun isHappy(n: Int): Boolean = generateSequence(n to mutableSetOf<Int>()) { (num, seen) -> (num.toString().map { it.digitToInt() }.sumOf { it * it }).let { next -> (next to seen.apply { add(num) }).takeIf { next !in seen && next != 1 } } }.last().let { (num, _) -> num == 1 || num.toString().map { it.digitToInt() }.sumOf { it * it } == 1 } }