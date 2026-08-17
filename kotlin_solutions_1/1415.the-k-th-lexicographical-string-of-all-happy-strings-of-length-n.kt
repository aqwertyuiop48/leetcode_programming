/*
 * @lc app=leetcode id=1415 lang=kotlin
 *
 * [1415] The k-th Lexicographical String of All Happy Strings of Length n
 */

class Solution { fun getHappyString(n: Int, k: Int): String = (1..n).fold(listOf("")) { acc, _ -> acc.flatMap { s -> listOf('a', 'b', 'c').filter { c -> s.isEmpty() || s.last() != c }.map { s + c } } }.getOrNull(k - 1) ?: "" }