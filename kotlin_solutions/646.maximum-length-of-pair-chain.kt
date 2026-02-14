/*
 * @lc app=leetcode id=646 lang=kotlin
 *
 * [646] Maximum Length of Pair Chain
 */

class Solution { fun findLongestChain(pairs: Array<IntArray>): Int = pairs.sortedBy { it[1] }.fold(-1001 to 0) { (lastEnd, cnt), p -> if (p[0] > lastEnd) p[1] to cnt + 1 else lastEnd to cnt }.second }
