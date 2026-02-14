/*
 * @lc app=leetcode id=630 lang=kotlin
 *
 * [630] Course Schedule III
 */

class Solution { fun scheduleCourse(courses: Array<IntArray>): Int = courses.sortedBy { it[1] }.fold(PriorityQueue<Int>(compareByDescending { it }) to 0) { (queue, time), (duration, lastDay) -> if (time + duration <= lastDay) queue.apply { add(duration) } to time + duration else if (queue.isNotEmpty() && queue.peek() > duration) queue.peek().let { removed -> queue.apply { poll().also{add(duration)} } to time + duration - removed } else queue to time }.first.size }
