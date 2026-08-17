/*
 * @lc app=leetcode id=1732 lang=kotlin
 *
 * [1732] Find the Highest Altitude
 */

class Solution { fun largestAltitude(gain: IntArray): Int = gain.fold(0 to 0) { (max, curr), g -> (curr + g).let { maxOf(max, it) to it } }.first }