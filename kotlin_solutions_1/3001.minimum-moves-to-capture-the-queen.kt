/*
 * @lc app=leetcode id=3001 lang=kotlin
 *
 * [3001] Minimum Moves to Capture The Queen
 */

class Solution { fun minMovesToCaptureTheQueen(a: Int, b: Int, c: Int, d: Int, e: Int, f: Int): Int = if ((a == e && !(a == c && d in minOf(b, f) + 1 until maxOf(b, f))) || (b == f && !(b == d && c in minOf(a, e) + 1 until maxOf(a, e))) || (Math.abs(c - e) == Math.abs(d - f) && !(Math.abs(a - c) == Math.abs(b - d) && Math.abs(a - e) == Math.abs(b - f) && a in minOf(c, e) + 1 until maxOf(c, e)))) 1 else 2 }