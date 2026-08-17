/*
 * @lc app=leetcode id=1776 lang=kotlin
 *
 * [1776] Car Fleet II
 */
class Solution { fun getCollisionTimes(cars: Array<IntArray>): DoubleArray = DoubleArray(cars.size) { -1.0 }.also { res -> cars.indices.reversed().fold(mutableListOf<Int>()) { stack, i -> stack.also { s -> generateSequence { if (s.isNotEmpty() && (cars[i][1] <= cars[s.last()][1] || (res[s.last()] >= 0.0 && (cars[s.last()][0] - cars[i][0]).toDouble() / (cars[i][1] - cars[s.last()][1]) >= res[s.last()]))) s.removeAt(s.size - 1) else null }.count() }.also { s -> if (s.isNotEmpty()) res[i] = (cars[s.last()][0] - cars[i][0]).toDouble() / (cars[i][1] - cars[s.last()][1]) }.apply { add(i) } } } }