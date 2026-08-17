/*
 * @lc app=leetcode id=1840 lang=kotlin
 *
 * [1840] Maximum Building Height
 */

class Solution { fun maxBuilding(n: Int, restrictions: Array<IntArray>): Int = (restrictions.map { it[0] to it[1] } + (1 to 0) + (n to n - 1)).groupBy { it.first }.map { (id, list) -> intArrayOf(id, list.minOf { it.second }) }.sortedBy { it[0] }.toTypedArray().also { arr -> (1 until arr.size).forEach { i -> arr[i][1] = minOf(arr[i][1], arr[i - 1][1] + arr[i][0] - arr[i - 1][0]) } }.also { arr -> (arr.size - 2 downTo 0).forEach { i -> arr[i][1] = minOf(arr[i][1], arr[i + 1][1] + arr[i + 1][0] - arr[i][0]) } }.let { arr -> (1 until arr.size).maxOf { i -> (arr[i - 1][1] + arr[i][1] + arr[i][0] - arr[i - 1][0]) / 2 } } }