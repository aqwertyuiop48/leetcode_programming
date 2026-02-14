/*
 * @lc app=leetcode id=391 lang=kotlin
 *
 * [391] Perfect Rectangle
 */

class Solution {fun isRectangleCover(rectangles: Array<IntArray>): Boolean = rectangles.fold(listOf(Int.MAX_VALUE, Int.MAX_VALUE, Int.MIN_VALUE, Int.MIN_VALUE)) { (minX, minY, maxX, maxY), rect -> listOf(minOf(minX, rect[0]), minOf(minY, rect[1]), maxOf(maxX, rect[2]), maxOf(maxY, rect[3])) }.let { (minX, minY, maxX, maxY) -> rectangles.flatMap { (x1, y1, x2, y2) -> listOf(x1 to y1, x1 to y2, x2 to y1, x2 to y2) }.groupingBy { it }.eachCount().filter { it.value % 2 == 1 }.keys.let { oddCorners -> oddCorners.size == 4 && setOf(minX to minY, minX to maxY, maxX to minY, maxX to maxY) == oddCorners } && rectangles.sumOf { (it[2] - it[0]).toLong() * (it[3] - it[1]) } == (maxX - minX).toLong() * (maxY - minY) }}

