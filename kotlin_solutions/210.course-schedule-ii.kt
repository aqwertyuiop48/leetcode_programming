/*
 * @lc app=leetcode id=210 lang=kotlin
 *
 * [210] Course Schedule II
 */

class Solution { fun findOrder(numCourses: Int, prerequisites: Array<IntArray>): IntArray = Array(numCourses) { mutableListOf<Int>() }.apply { prerequisites.forEach { (course, pre) -> this[pre].add(course) } }.let { graph -> IntArray(numCourses).let { visited -> mutableListOf<Int>().let { result -> (0 until numCourses).all { course -> DeepRecursiveFunction<Int, Boolean> { c -> when (visited[c]) { 1 -> {false} 2 -> {true} else -> { 1.also { visited[c] = it }.let { graph[c].all { callRecursive(it) }.also { visited[c] = 2.also { result.add(c) } } } } } }.invoke(course) }.let { if (it) result.reversed().toIntArray() else intArrayOf() } } } } }
