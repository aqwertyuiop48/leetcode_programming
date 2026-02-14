/*
 * @lc app=leetcode id=825 lang=kotlin
 *
 * [825] Friends Of Appropriate Ages
 */

class Solution { fun numFriendRequests(ages: IntArray): Int = IntArray(121).apply { ages.forEach { this[it]++ } }.let { map -> (0..120).sumOf { i -> (0..120).sumOf { j -> if (!(j <= 0.5 * i + 7 || j > i || (j > 100 && i < 100))) map[i] * map[j] - if (i == j) map[i] else 0 else 0 } } } }

