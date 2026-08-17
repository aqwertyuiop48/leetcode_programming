/*
 * @lc app=leetcode id=1518 lang=kotlin
 *
 * [1518] Water Bottles
 */

class Solution {
    fun numWaterBottles(numBottles: Int, numExchange: Int): Int = numBottles + (numBottles - 1) / (numExchange - 1)
}