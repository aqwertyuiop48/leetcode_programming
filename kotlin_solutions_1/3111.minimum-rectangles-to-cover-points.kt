/*
 * @lc app=leetcode id=3111 lang=kotlin
 *
 * [3111] Minimum Rectangles to Cover Points
 */

class Solution {
    fun minRectanglesToCoverPoints(points: Array<IntArray>, w: Int): Int = points.map { it[0] }.sorted().fold(-1 to 0) { (last, count), x -> if (last == -1 || x > last + w) x to (count + 1) else last to count }.second
}