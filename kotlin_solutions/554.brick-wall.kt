/*
 * @lc app=leetcode id=554 lang=kotlin
 *
 * [554] Brick Wall
 */

class Solution { fun leastBricks(wall: List<List<Int>>) = wall.size - (wall.flatMap { row -> row.dropLast(1).runningFold(0) { acc, w -> acc + w }.drop(1) }.groupingBy { it }.eachCount().maxOfOrNull { it.value } ?: 0) }

