/*
 * @lc app=leetcode id=443 lang=kotlin
 *
 * [443] String Compression
 */

class Solution {fun compress(chars: CharArray): Int = chars.toList().fold(mutableListOf<Pair<Char, Int>>()) { acc, c -> if (acc.isEmpty() || acc.last().first != c) acc.apply { add(c to 1) } else acc.apply { this[lastIndex] = c to (last().second + 1) } }.flatMap { (c, cnt) -> listOf(c) + if (cnt > 1) cnt.toString().toList() else emptyList() }.also { it.forEachIndexed { i, c -> chars[i] = c } }.size}
