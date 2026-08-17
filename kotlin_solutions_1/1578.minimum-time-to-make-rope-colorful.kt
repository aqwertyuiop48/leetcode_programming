/*
 * @lc app=leetcode id=1578 lang=kotlin
 *
 * [1578] Minimum Time to Make Rope Colorful
 */

class Solution {
    fun minCost(colors: String, neededTime: IntArray): Int = (1 until colors.length).fold(Triple(0, neededTime[0], neededTime[0])) { (ans, curSum, curMax), i -> if (colors[i] == colors[i - 1]) Triple(ans, curSum + neededTime[i], maxOf(curMax, neededTime[i])) else Triple(ans + curSum - curMax, neededTime[i], neededTime[i]) }.let { (ans, curSum, curMax) -> ans + curSum - curMax }
}