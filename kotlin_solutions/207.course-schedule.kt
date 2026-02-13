/*
 * @lc app=leetcode id=207 lang=kotlin
 *
 * [207] Course Schedule
 */


class Solution { fun canFinish(numCourses: Int, prerequisites: Array<IntArray>): Boolean = Array(numCourses) { mutableListOf<Int>() }.apply { prerequisites.forEach { (course, pre) -> this[course].add(pre) } }.let { graph -> IntArray(numCourses).let { visited -> (0 until numCourses).all { course -> DeepRecursiveFunction<Int, Boolean> { c -> when (visited[c]) { 1 -> false 2 -> true else -> 1.also { visited[c] = it }.let { graph[c].all { callRecursive(it) }.also { visited[c] = 2 } } } }.invoke(course) } } } }