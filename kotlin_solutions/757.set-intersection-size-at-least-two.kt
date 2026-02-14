/*
 * @lc app=leetcode id=757 lang=kotlin
 *
 * [757] Set Intersection Size At Least Two
 */

class Solution { fun intersectionSizeTwo(intervals: Array<IntArray>): Int = intervals.sortedWith(compareBy<IntArray> { it[1] }.thenByDescending { it[0] }).let { sorted -> sorted.fold(mutableListOf<Int>()) { points, (start, end) -> points.apply { when { isEmpty() || last() < start -> {addAll(listOf(end - 1, end))} size == 1 || this[lastIndex - 1] < start -> {add(end)} } } }.size } }

