/*
 * @lc app=leetcode id=3386 lang=java
 *
 * [3386] Button with Longest Push Time
 */

fun buttonWithLongestTime(events: Array<IntArray>): Int = events.indices.map { i -> (events[i][1] - (if (i == 0) 0 else events[i - 1][1])) to events[i][0] }.maxWith(compareBy<Pair<Int, Int>> { it.first }.thenByDescending { it.second }).second