/*
 * @lc app=leetcode id=729 lang=kotlin
 *
 * [729] My Calendar I
 */

class MyCalendar(private val events: MutableList<Pair<Int, Int>> = mutableListOf()) { fun book(start: Int, end: Int) = events.none { (s, e) -> maxOf(start, s) < minOf(end, e) }.also { if (it) events.add(start to end) } }
