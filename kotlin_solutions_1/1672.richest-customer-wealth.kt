/*
 * @lc app=leetcode id=1672 lang=kotlin
 *
 * [1672] Richest Customer Wealth
 */

class Solution { fun maximumWealth(accounts: Array<IntArray>): Int = accounts.maxOf { it.sum() } }