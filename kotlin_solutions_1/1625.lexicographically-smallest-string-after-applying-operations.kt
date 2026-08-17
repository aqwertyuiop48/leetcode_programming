/*
 * @lc app=leetcode id=1625 lang=kotlin
 *
 * [1625] Lexicographically Smallest String After Applying Operations
 */

class Solution { fun findLexSmallestString(s: String, a: Int, b: Int): String = mutableSetOf<String>().also { vis -> DeepRecursiveFunction<String, Unit> { str -> if (vis.add(str)) call(str.takeLast(b) + str.dropLast(b)).also { call(String(CharArray(str.length) { if (it % 2 == 1) '0' + (str[it] - '0' + a) % 10 else str[it] })) } }(s) }.minOrNull()!! }