/*
 * @lc app=leetcode id=541 lang=kotlin
 *
 * [541] Reverse String II
 */

class Solution { fun reverseStr(s: String, k: Int) = s.chunked(k).mapIndexed { i, chunk -> if (i % 2 == 0) chunk.reversed() else chunk }.joinToString("") }

