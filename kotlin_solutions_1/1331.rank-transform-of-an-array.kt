/*
 * @lc app=leetcode id=1331 lang=kotlin
 *
 * [1331] Rank Transform of an Array
 */

class Solution { fun arrayRankTransform(arr: IntArray): IntArray = arr.distinct().sorted().withIndex().associate { (i, v) -> v to i + 1 }.let { rankMap -> arr.map { rankMap[it]!! }.toIntArray() } }