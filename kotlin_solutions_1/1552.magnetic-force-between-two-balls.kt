/*
 * @lc app=leetcode id=1552 lang=kotlin
 *
 * [1552] Magnetic Force Between Two Balls
 */

class Solution { fun maxDistance(position: IntArray, m: Int): Int = position.sortedArray().let { pos -> generateSequence(Triple(1, pos.last() - pos.first(), 0)) { (low, high, ans) -> if (low > high) null else (low + (high - low) / 2).let { mid -> if (pos.fold(0 to -1_000_000_000) { (cnt, last), p -> if (p - last >= mid) (cnt + 1) to p else cnt to last }.first >= m) Triple(mid + 1, high, mid) else Triple(low, mid - 1, ans) } }.last().third } }