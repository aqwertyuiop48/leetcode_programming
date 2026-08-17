/*
 * @lc app=leetcode id=2225 lang=kotlin
 *
 * [2225] Find Players With Zero or One Losses
 */

class Solution {
    fun findWinners(matches: Array<IntArray>) = matches.flatMap { it.asIterable() }.toSet().let { p -> matches.groupingBy { it[1] }.eachCount().let { l -> listOf(p.filter { (l[it] ?: 0) == 0 }.sorted(), p.filter { l[it] == 1 }.sorted()) } }
}