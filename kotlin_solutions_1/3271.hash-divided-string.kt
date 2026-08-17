/*
 * @lc app=leetcode id=3271 lang=java
 *
 * [3271] Hash Divided String
 */

class Solution {
    fun stringHash(s: String, k: Int): String = s.chunked(k).joinToString("") { chunk -> ('a' + (chunk.sumOf { it - 'a' } % 26)).toChar().toString() }
}