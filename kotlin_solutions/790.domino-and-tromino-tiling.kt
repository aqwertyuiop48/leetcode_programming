/*
 * @lc app=leetcode id=790 lang=kotlin
 *
 * [790] Domino and Tromino Tiling
 */

class Solution { fun numTilings(n: Int): Int = (2..n).fold(arrayOf(longArrayOf(0, 0, 1), longArrayOf(0, 0, 1))) { (prev2, prev1), _ -> arrayOf(prev1, longArrayOf( (prev1[1] + prev2[2]) % 1_000_000_007, (prev1[0] + prev2[2]) % 1_000_000_007, (prev1[2] + prev2[2] + prev1[0] + prev1[1]) % 1_000_000_007 )) }.let { if (n == 1) 1 else it[1][2].toInt() } }
