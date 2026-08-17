/*
 * @lc app=leetcode id=1711 lang=kotlin
 *
 * [1711] Count Good Meals
 */

class Solution {
    fun countPairs(deliciousness: IntArray): Int = HashMap<Int, Int>().let { map -> deliciousness.fold(0L) { ans, d -> (0..21).fold(0L) { sum, i -> sum + (map[(1 shl i) - d] ?: 0) }.let { add -> map.merge(d, 1, Int::plus).run { (ans + add) % 1000000007 } } }.toInt() }
}