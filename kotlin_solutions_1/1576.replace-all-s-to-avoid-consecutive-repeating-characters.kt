/*
 * @lc app=leetcode id=1576 lang=kotlin
 *
 * [1576] Replace All ?'s to Avoid Consecutive Repeating Characters
 */

class Solution {
    fun modifyString(s: String): String = s.toCharArray().apply { indices.forEach { i -> if (this[i] == '?') this[i] = listOf('a', 'b', 'c').first { ch -> (i == 0 || this[i - 1] != ch) && (i == size - 1 || this[i + 1] != ch) } } }.let(::String)
}