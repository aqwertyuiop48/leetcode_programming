/*
 * @lc app=leetcode id=3433 lang=kotlin
 *
 * [3433] Count Mentions Per User
 */

class Solution {
    fun countMentions(numberOfUsers: Int, events: List<List<String>>): IntArray = IntArray(numberOfUsers).let { ans -> IntArray(numberOfUsers).let { online -> events.sortedWith(compareBy<List<String>> { it[1].toInt() }.thenByDescending { it[0] }).forEach { ev -> if (ev[0] == "OFFLINE") online[ev[2].toInt()] = ev[1].toInt() + 60 else if (ev[2] == "ALL") (0 until numberOfUsers).forEach { ans[it]++ } else if (ev[2] == "HERE") (0 until numberOfUsers).forEach { if (online[it] <= ev[1].toInt()) ans[it]++ } else ev[2].split(" ").forEach { ans[it.substring(2).toInt()]++ } }.let { ans } } }
}