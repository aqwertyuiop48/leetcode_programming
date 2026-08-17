/*
 * @lc app=leetcode id=1402 lang=kotlin
 *
 * [1402] Reducing Dishes
 */

class Solution { fun maxSatisfaction(satisfaction: IntArray): Int = satisfaction.sortedDescending().fold(0 to 0) { (total, sum), x -> if (sum + x > 0) (total + sum + x) to (sum + x) else total to sum }.first }