/*
 * @lc app=leetcode id=1419 lang=kotlin
 *
 * [1419] Minimum Number of Frogs Croaking
 */

class Solution { fun minNumberOfFrogs(croakOfFrogs: String): Int = croakOfFrogs.fold(Triple(IntArray(5), 0, true)) { (c, m, v), ch -> "croak".indexOf(ch).let { i -> if (i == -1 || !v) Triple(c, m, false) else c.also { it[i]++ }.let { if (i > 0 && c[i] > c[i - 1]) Triple(c, m, false) else Triple(c, maxOf(m, c[0] - c[4]), true) } } }.let { (c, m, v) -> if (v && c.all { it == c[0] }) m else -1 } }