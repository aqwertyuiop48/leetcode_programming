/*
 * @lc app=leetcode id=1247 lang=kotlin
 *
 * [1247] Minimum Swaps to Make Strings Equal
 */

class Solution { fun minimumSwap(s1: String, s2: String): Int = s1.indices.filter { s1[it] != s2[it] }.partition { s1[it] == 'x' }.let { (x, y) -> if ((x.size + y.size) % 2 != 0) -1 else x.size / 2 + y.size / 2 + (x.size % 2) * 2 } }