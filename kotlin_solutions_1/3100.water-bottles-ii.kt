/*
 * @lc app=leetcode id=3100 lang=kotlin
 *
 * [3100] Water Bottles II
 */

class Solution { fun maxBottlesDrunk(numBottles: Int, numExchange: Int): Int = intArrayOf(numBottles, numBottles, numExchange).also { st -> while (st[1] >= st[2]) st.also { st[0]++ }.also { st[1] -= st[2] - 1 }.also { st[2]++ } }[0] }