/*
 * @lc app=leetcode id=3296 lang=java
 *
 * [3296] Minimum Number of Seconds to Make Mountain Height Zero
 */

class Solution {
    fun minNumberOfSeconds(mountainHeight: Int, workerTimes: IntArray): Long = (0..62).fold(longArrayOf(0L, 100000000000000000L, 100000000000000000L)) { acc, _ -> acc.apply { (acc[0] + (acc[1] - acc[0]) / 2).let { mid -> if (workerTimes.fold(0L) { a, t -> a + (Math.sqrt(1.0 + 8.0 * mid / t).toLong() - 1) / 2 } >= mountainHeight) run { acc[2] = mid }.run { acc[1] = mid - 1 } else run { acc[0] = mid + 1 } } } }.let { it[2] }
}