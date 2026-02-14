/*
 * @lc app=leetcode id=441 lang=kotlin
 *
 * [441] Arranging Coins
 */

class Solution { fun arrangeCoins(n: Int): Int = generateSequence(n to 1) { (coins, row) -> (coins - row to row + 1).takeIf { coins >= row } }.last().second - 1 }
