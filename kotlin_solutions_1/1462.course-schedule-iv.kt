/*
 * @lc app=leetcode id=1462 lang=kotlin
 *
 * [1462] Course Schedule IV
 */

class Solution { fun checkIfPrerequisite(numCourses: Int, prerequisites: Array<IntArray>, queries: Array<IntArray>): List<Boolean> = prerequisites.fold(Array(numCourses) { BooleanArray(numCourses) }) { adj, p -> adj.also { it[p[0]][p[1]] = true } }.let { adj -> (0 until numCourses).fold(adj) { m, k -> m.also { for (i in 0 until numCourses) for (j in 0 until numCourses) m[i][j] = m[i][j] || (m[i][k] && m[k][j]) } } }.let { adj -> queries.map { adj[it[0]][it[1]] } } }