/*
 * @lc app=leetcode id=761 lang=kotlin
 *
 * [761] Special Binary String
 */

class Solution { fun makeLargestSpecial(s: String): String = s.indices.fold(Triple(0, 0, mutableListOf<String>())) { (count, start, list), j -> (count + if (s[j] == '1') 1 else -1).let { newCount -> Triple(newCount, if (newCount == 0) j + 1 else start, list.apply { if (newCount == 0) add("1${makeLargestSpecial(s.substring(start + 1, j))}0") }) } }.third.sortedDescending().joinToString("") }

