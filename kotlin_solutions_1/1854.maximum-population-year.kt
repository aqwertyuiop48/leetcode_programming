/*
 * @lc app=leetcode id=1854 lang=kotlin
 *
 * [1854] Maximum Population Year
 */
class Solution { fun maximumPopulation(logs: Array<IntArray>): Int = (1950..2050).maxByOrNull { y -> logs.count { it[0] <= y && y < it[1] } * 10000 + (2050 - y) } !! }