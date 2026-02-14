/*
 * @lc app=leetcode id=732 lang=kotlin
 *
 * [732] My Calendar III
 */

class MyCalendarThree(private val map: MutableMap<Int, Int> = mutableMapOf()) { fun book(start: Int, end: Int) = map.apply { put(start, getOrDefault(start, 0) + 1) }.apply { put(end, getOrDefault(end, 0) - 1) }.toSortedMap().values.fold(0 to 0) { (cur, max), delta -> (cur + delta) to maxOf(max, cur + delta) }.second }

