/*
 * @lc app=leetcode id=447 lang=kotlin
 *
 * [447] Number of Boomerangs
 */

class Solution { fun numberOfBoomerangs(points: Array<IntArray>): Int = points.sumOf { i -> points.groupingBy { j -> (i[0] - j[0]) * (i[0] - j[0]) + (i[1] - j[1]) * (i[1] - j[1]) } .eachCount().values.sumOf { it * (it - 1) } } }
