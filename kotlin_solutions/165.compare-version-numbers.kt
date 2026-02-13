/*
 * @lc app=leetcode id=165 lang=kotlin
 *
 * [165] Compare Version Numbers
 */

class Solution {fun compareVersion(version1: String, version2: String): Int = version1.split(".").map { it.toInt() }.zipAll(version2.split(".").map { it.toInt() }, 0, 0) .firstOrNull { (a, b) -> a != b }?.let { (a, b) -> a.compareTo(b) } ?: 0 fun <A, B> List<A>.zipAll(other: List<B>, defaultA: A, defaultB: B): List<Pair<A, B>> = (0 until maxOf(size, other.size)).map { getOrElse(it) { defaultA } to other.getOrElse(it) { defaultB } } }
