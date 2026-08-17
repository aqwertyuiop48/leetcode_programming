/*
 * @lc app=leetcode id=1232 lang=kotlin
 *
 * [1232] Check If It Is a Straight Line
 */
class Solution { fun checkStraightLine(co: Array<IntArray>): Boolean = (0..co.size - 3).all { i -> (co[i + 1][1] - co[i][1]) * (co[i + 2][0] - co[i + 1][0]) == (co[i + 2][1] - co[i + 1][1]) * (co[i + 1][0] - co[i][0]) } }