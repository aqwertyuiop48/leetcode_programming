/*
 * @lc app=leetcode id=1024 lang=kotlin
 *
 * [1024] Video Stitching
 */

class Solution {
    fun videoStitching(clips: Array<IntArray>, time: Int): Int = (1..time).fold(IntArray(time + 1) { if (it == 0) 0 else 100 }) { dp, i -> dp.also { dp[i] = clips.filter { c -> c[0] <= i && c[1] >= i }.minOfOrNull { c -> dp[c[0]] + 1 } ?: 100 } }[time].let { if (it >= 100) -1 else it }
}