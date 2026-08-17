/*
 * @lc app=leetcode id=3442 lang=kotlin
 *
 * [3442] Maximum Difference Between Even and Odd Frequency I
 */

class Solution {
    fun maxDifference(s: String): Int = s.groupingBy { it }.eachCount().values.let { c -> c.filter { it % 2 != 0 }.maxOrNull()!! - c.filter { it % 2 == 0 }.minOrNull()!! }
}