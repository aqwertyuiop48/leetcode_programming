/*
 * @lc app=leetcode id=1434 lang=kotlin
 *
 * [1434] Number of Ways to Wear Different Hats to Each Other
 */

class Solution { fun numberWays(hats: List<List<Int>>): Int = hats.indices.fold(IntArray(41)) { h2p, p -> h2p.also { hats[p].forEach { h -> it[h] = it[h] or (1 shl p) } } }.let { hatToPeople -> (1..40).fold(IntArray(1 shl hats.size).apply { this[0] = 1 }) { dp, h -> dp.also { if (hatToPeople[h] != 0) ((1 shl hats.size) - 1 downTo 0).forEach { mask -> hats.indices.forEach { p -> if ((hatToPeople[h] and (1 shl p)) != 0 && (mask and (1 shl p)) != 0) dp[mask] = (dp[mask] + dp[mask xor (1 shl p)]) % 1000000007 } } } } }[(1 shl hats.size) - 1] } }