/*
 * @lc app=leetcode id=3325 lang=java
 *
 * [3325] Count Substrings With K-Frequency Characters I
 */
fun numberOfSubstrings(s: String, k: Int): Int = IntArray(26).let { cnt -> (0 until s.length).fold(0 to 0) { (ans, l), r -> (cnt[s[r] - 'a']++).let { generateSequence(l) { it + 1 }.takeWhile { cnt.any { it >= k } }.fold(ans to l) { (a, curL), _ -> (a + (s.length - r)) to (curL + 1).also { cnt[s[curL] - 'a']-- } } } } }.first