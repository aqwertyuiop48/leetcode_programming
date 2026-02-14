/*
 * @lc app=leetcode id=789 lang=kotlin
 *
 * [789] Escape The Ghosts
 */

class Solution {fun escapeGhosts(ghosts: Array<IntArray>, target: IntArray, myDist: Int = dist(intArrayOf(0, 0), target)) =!ghosts.any { dist(it, target) <= myDist } fun dist(from: IntArray, to: IntArray): Int = abs(from[0] - to[0]) + abs(from[1] - to[1])}