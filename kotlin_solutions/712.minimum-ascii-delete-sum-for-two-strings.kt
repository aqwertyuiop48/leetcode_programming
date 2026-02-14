/*
 * @lc app=leetcode id=712 lang=kotlin
 *
 * [712] Minimum ASCII Delete Sum for Two Strings
 */

class Solution { fun minimumDeleteSum(s1: String, s2: String): Int = mutableMapOf<Pair<Int, Int>, Int>().let { memo -> DeepRecursiveFunction<Pair<Int, Int>, Int> { (i, j) -> memo.getOrPut(i to j) { when { i == s1.length && j == s2.length -> {0} i == s1.length -> {s2[j].code + callRecursive(i to j + 1)} j == s2.length ->{ s1[i].code + callRecursive(i + 1 to j)} s1[i] == s2[j] -> {callRecursive(i + 1 to j + 1)} else -> minOf(s1[i].code + callRecursive(i + 1 to j), s2[j].code + callRecursive(i to j + 1)) } } }(0 to 0) } }