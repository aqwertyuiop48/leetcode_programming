/*
 * @lc app=leetcode id=1927 lang=kotlin
 *
 * [1927] Sum Game
 */

class Solution {
    fun sumGame(num: String): Boolean = num.length.let { n -> num.take(n / 2).fold(0 to 0) { (s, q), c -> if (c == '?') s to q + 1 else s + (c - '0') to q }.let { (s1, q1) -> num.takeLast(n / 2).fold(0 to 0) { (s, q), c -> if (c == '?') s to q + 1 else s + (c - '0') to q }.let { (s2, q2) -> (q1 + q2) % 2 == 1 || s1 - s2 != 9 * (q2 - q1) / 2 } } }
}