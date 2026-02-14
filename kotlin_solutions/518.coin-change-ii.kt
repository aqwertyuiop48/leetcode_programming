/*
 * @lc app=leetcode id=518 lang=kotlin
 *
 * [518] Coin Change II
 */

class Solution { fun change(amount: Int, coins: IntArray) = IntArray(amount + 1).apply { this[0] = 1 }.also { combinations -> coins.forEach { coin -> (coin..amount).forEach { i -> combinations[i] += combinations[i - coin] } } }[amount] }
