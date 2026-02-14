/*
 * @lc app=leetcode id=519 lang=kotlin
 *
 * [519] Random Flip Matrix
 */

class Solution( private val m: Int, private val n: Int, private var total: Int = m * n, private val map: MutableMap<Int, Int> = mutableMapOf(), private val rand: kotlin.random.Random = kotlin.random.Random.Default ) { fun flip(): IntArray = rand.nextInt(total--).let { r -> map.getOrDefault(r, r) .also { map[r] = map.getOrDefault(total, total) } .run { intArrayOf(this / n, this % n) } } fun reset() = map.clear().also { total = m * n } }
