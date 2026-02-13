/*
 * @lc app=leetcode id=155 lang=kotlin
 *
 * [155] Min Stack
 */


class MinStack(private val s: MutableList<Pair<Int, Int>> = mutableListOf(), val push: (Int) -> Boolean = { v -> s.add(v to minOf(v, s.lastOrNull()?.second ?: v)) }, val pop: () -> Any? = { s.removeLastOrNull() }, val top: () -> Int = { s.last().first }, val getMin: () -> Int = { s.last().second })