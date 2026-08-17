/*
 * @lc app=leetcode id=1395 lang=kotlin
 *
 * [1395] Count Number of Teams
 */

class Solution {
    fun numTeams(rating: IntArray): Int = (1 until rating.size - 1).sumOf { i -> (0 until i).count { rating[it] < rating[i] } * (i + 1 until rating.size).count { rating[i] < rating[it] } + (0 until i).count { rating[it] > rating[i] } * (i + 1 until rating.size).count { rating[i] > rating[it] } }
}