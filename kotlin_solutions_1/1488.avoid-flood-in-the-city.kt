/*
 * @lc app=leetcode id=1488 lang=kotlin
 *
 * [1488] Avoid Flood in The City
 */

class Solution { fun avoidFlood(rains: IntArray): IntArray = IntArray(rains.size) { 1 }.let { ans -> java.util.TreeSet<Int>().let { dryDays -> mutableMapOf<Int, Int>().let { lastRain -> if (rains.indices.all { i -> if (rains[i] == 0) dryDays.add(i) else (ans.apply { this[i] = -1 } != null) && (lastRain[rains[i]]?.let { prev -> dryDays.ceiling(prev)?.also { dryDay -> ans[dryDay] = rains[i] }.also { dryDay -> dryDays.remove(dryDay) } } != null || !lastRain.containsKey(rains[i])).also { lastRain[rains[i]] = i } }) ans else intArrayOf() } } } }