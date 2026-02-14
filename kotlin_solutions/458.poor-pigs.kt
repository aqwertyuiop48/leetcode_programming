/*
 * @lc app=leetcode id=458 lang=kotlin
 *
 * [458] Poor Pigs
 */

class Solution { fun poorPigs(buckets: Int, minutesToDie: Int, minutesToTest: Int): Int = generateSequence(0) { it + 1 }.first { Math.pow((minutesToTest / minutesToDie + 1).toDouble(), it.toDouble()) >= buckets } }