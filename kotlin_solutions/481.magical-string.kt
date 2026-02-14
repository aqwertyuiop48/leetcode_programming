/*
 * @lc app=leetcode id=481 lang=kotlin
 *
 * [481] Magical String
 */

class Solution { fun magicalString(n: Int): Int = generateSequence(Triple(mutableListOf(1, 2, 2), 1, 2)) { (s, v, i) -> if (i < n) s[i].let { c -> s.add(v).let { if (c == 2) s.add(v) }.let { Triple(s, v xor 3, i + 1) } } else null }.last().let { (s, _, _) -> s.take(n).count { it == 1 } } }