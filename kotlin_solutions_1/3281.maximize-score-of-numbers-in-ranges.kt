/*
 * @lc app=leetcode id=3281 lang=java
 *
 * [3281] Maximize Score of Numbers in Ranges
 */

class Solution {
    fun maxPossibleScore(start: IntArray, d: Int): Int = start.sorted().toLongArray().let { s -> (0..31).fold(0L to 2000000001L) { (l, r), _ -> (l + (r - l) / 2).let { mid -> if ((1 until s.size).fold(s[0]) { cur, i -> if (cur + mid > s[i] + d) 3000000000L else maxOf(s[i], cur + mid) } <= 2000000000L) mid to r else l to mid } }.first.toInt() }
}