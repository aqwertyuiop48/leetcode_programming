/*
 * @lc app=leetcode id=868 lang=kotlin
 *
 * [868] Binary Gap
 */

class Solution { fun binaryGap(n: Int) = n.toString(2).mapIndexedNotNull { i, c -> i.takeIf { c == '1' } }.zipWithNext { a, b -> b - a }.maxOrNull() ?: 0 }

