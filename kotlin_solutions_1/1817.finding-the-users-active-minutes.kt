/*
 * @lc app=leetcode id=1817 lang=kotlin
 *
 * [1817] Finding the Users Active Minutes
 */

class Solution { fun findingUsersActiveMinutes(logs: Array<IntArray>, k: Int): IntArray = IntArray(k).apply { logs.groupBy { it[0] }.values.map { it.map { x -> x[1] }.distinct().size }.forEach { if (it in 1..k) this[it - 1]++ } } }