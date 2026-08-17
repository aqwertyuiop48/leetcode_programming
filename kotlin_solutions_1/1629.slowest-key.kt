/*
 * @lc app=leetcode id=1629 lang=kotlin
 *
 * [1629] Slowest Key
 */

class Solution { fun slowestKey(releaseTimes: IntArray, keysPressed: String): Char = releaseTimes.indices.maxWithOrNull(compareBy<Int> { if (it == 0) releaseTimes[0] else releaseTimes[it] - releaseTimes[it - 1] }.thenBy { keysPressed[it] })!!.let { keysPressed[it] } }