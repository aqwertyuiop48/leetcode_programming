/*
 * @lc app=leetcode id=299 lang=kotlin
 *
 * [299] Bulls and Cows
 */

class Solution {fun getHint(secret: String, guess: String) = secret.indices.fold(Triple(0, IntArray(10), IntArray(10))) { (bulls, sCount, gCount), i -> if (secret[i] == guess[i]) Triple(bulls + 1, sCount, gCount) else Triple(bulls, sCount.apply { this[secret[i] - '0']++ }, gCount.apply { this[guess[i] - '0']++ }) }.let { (bulls, sCount, gCount) -> "$bulls" + "A" + "${sCount.indices.sumOf { minOf(sCount[it], gCount[it]) }}" + "B" }}
