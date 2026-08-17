/*
 * @lc app=leetcode id=1103 lang=kotlin
 *
 * [1103] Distribute Candies to People
 */

class Solution {
    fun distributeCandies(candies: Int, num_people: Int): IntArray = IntArray(num_people).also { res -> intArrayOf(candies, 1, 0).let { v -> while (v[0] > 0) minOf(v[1], v[0]).let { give -> res.set(v[2] % num_people, res[v[2] % num_people] + give).run { v[0] -= give }.run { v[1]++ }.run { v[2]++ } } } }
}