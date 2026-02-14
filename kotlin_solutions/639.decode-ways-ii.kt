/*
 * @lc app=leetcode id=639 lang=kotlin
 *
 * [639] Decode Ways II
 */

class Solution { fun numDecodings(s: String): Int = mutableMapOf<String, Int>().let { memo -> { str: String, idx: Int -> (str to idx).let { current -> DeepRecursiveFunction<Pair<String, Int>, Int> { (s, i) -> "$s,$i".let { key -> memo.getOrPut(key) { if (i == s.length) if (s.toIntOrNull()?.let { it in 1..26 } == true) 1 else 0 else if (s[i] == '*') (1..9).sumOf { j -> callRecursive(s.substring(0, i) + j + s.substring(i + 1) to i + 1) } else callRecursive(s to i + 1) } } }(current) } }.let { getValidTypes -> mutableMapOf<Int, Int>().let { dp -> DeepRecursiveFunction<Int, Int> { index -> dp.getOrPut(index) { if (index == s.length) 1 else if (s[index] == '0') 0 else (index..minOf(index + 1, s.length - 1)).fold(0) { acc, i -> getValidTypes(s.substring(index, i + 1), 0).let { validTypes -> if (validTypes > 0) ((acc.toLong() + callRecursive(i + 1).toLong() * validTypes.toLong()) % 1_000_000_007).toInt() else acc } } } }(0) } } } }
