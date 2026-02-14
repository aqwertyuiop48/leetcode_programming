/*
 * @lc app=leetcode id=731 lang=kotlin
 *
 * [731] My Calendar II
 */

class MyCalendarTwo(private val single: MutableList<Pair<Int, Int>> = mutableListOf(), private val double: MutableList<Pair<Int, Int>> = mutableListOf()) { fun book(start: Int, end: Int) = double.none { (s, e) -> maxOf(start, s) < minOf(end, e) }.also { if (it) single.filter { (s, e) -> maxOf(start, s) < minOf(end, e) }.forEach { (s, e) -> double.add(maxOf(start, s) to minOf(end, e)) }.run { single.add(start to end) } } }
