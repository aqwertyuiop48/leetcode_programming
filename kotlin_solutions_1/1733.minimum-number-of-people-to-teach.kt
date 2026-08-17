/*
 * @lc app=leetcode id=1733 lang=kotlin
 *
 * [1733] Minimum Number of People to Teach
 */
class Solution { fun minimumTeachings(n: Int, languages: Array<IntArray>, friendships: Array<IntArray>): Int = friendships.filter { f -> languages[f[0] - 1].none { l1 -> l1 in languages[f[1] - 1] } }.flatMap { listOf(it[0], it[1]) }.toSet().let { u -> if (u.isEmpty()) 0 else u.size - (1..n).maxOf { l -> u.count { l in languages[it - 1] } } } }