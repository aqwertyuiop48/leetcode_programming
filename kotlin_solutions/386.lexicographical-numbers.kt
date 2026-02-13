/*
 * @lc app=leetcode id=386 lang=kotlin
 *
 * [386] Lexicographical Numbers
 */

class Solution {fun lexicalOrder(n: Int): List<Int> = (1..n).map { it.toString() }.sorted().map { it.toInt() }}