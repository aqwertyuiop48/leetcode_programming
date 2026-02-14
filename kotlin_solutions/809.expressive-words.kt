/*
 * @lc app=leetcode id=809 lang=kotlin
 *
 * [809] Expressive Words
 */

class Solution { fun expressiveWords(s: String, words: Array<String>): Int = words.count { w -> generateSequence(0 to 0) { (i, j) -> w.getOrNull(i)?.takeIf { it == s.getOrNull(j) }?.let { c -> ((i until w.length).takeWhile { w[it] == c }.count() to (j until s.length).takeWhile { s[it] == c }.count()).let { (wc, sc) -> if (wc > sc || (sc < 3 && sc != wc)) null else (i + wc to j + sc) } } }.lastOrNull()?.let { (i, j) -> i == w.length && j == s.length } == true } }
