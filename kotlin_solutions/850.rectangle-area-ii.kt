/*
 * @lc app=leetcode id=850 lang=kotlin
 *
 * [850] Rectangle Area II
 */

class Solution { fun rectangleArea(rectangles: Array<IntArray>): Int = rectangles.flatMap { rec -> listOf( Event(rec[1], true, rec[0], rec[2]), Event(rec[3], false, rec[0], rec[2]) ) }.sortedBy { it.y }.let { events -> events.fold(Triple(mutableListOf<Pair<Int, Int>>(), events[0].y, 0L)) { (active, curY, res), event -> active.fold(Pair(-1, 0L)) { (cur, query), xs -> maxOf(cur, xs.first).let { newCur -> Pair(maxOf(newCur, xs.second), query + maxOf(xs.second - newCur, 0)) } }.let { (_, query) -> (res + query * (event.y - curY)).let { newRes -> (if (event.open) { active.add(event.x1 to event.x2).let { active.sortBy { it.first } }.let { active } } else { active.remove(event.x1 to event.x2).let { active } }).let { updatedActive -> Triple(updatedActive, event.y, newRes) } } } }.let { (_, _, res) -> (res % 1_000_000_007).toInt() } } } data class Event(val y: Int, val open: Boolean, val x1: Int, val x2: Int)
