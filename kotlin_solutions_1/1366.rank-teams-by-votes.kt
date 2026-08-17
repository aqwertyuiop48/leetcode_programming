/*
 * @lc app=leetcode id=1366 lang=kotlin
 *
 * [1366] Rank Teams by Votes
 */

class Solution { fun rankTeams(votes: Array<String>): String = IntArray(26 * votes[0].length).also { count -> votes.forEach { v -> v.forEachIndexed { i, c -> count[(c - 'A') * votes[0].length + i]++ } } }.let { count -> votes[0].toCharArray().sortedWith(Comparator { a, b -> (0 until votes[0].length).map { i -> count[(b - 'A') * votes[0].length + i] - count[(a - 'A') * votes[0].length + i] }.firstOrNull { it != 0 } ?: (a - b) }).joinToString("") } }