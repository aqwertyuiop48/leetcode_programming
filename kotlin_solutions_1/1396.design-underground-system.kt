/*
 * @lc app=leetcode id=1396 lang=kotlin
 *
 * [1396] Design Underground System
 */

class UndergroundSystem(val inMap: java.util.HashMap<Int, Pair<String, Int>> = java.util.HashMap(), val outMap: java.util.HashMap<String, DoubleArray> = java.util.HashMap()) { fun checkIn(id: Int, stationName: String, t: Int) { inMap[id] = stationName to t } fun checkOut(id: Int, stationName: String, t: Int) { inMap.remove(id)?.let { (s, st) -> "$s-$stationName".let { key -> outMap[key] = outMap.getOrDefault(key, DoubleArray(2)).let { DoubleArray(2) { idx -> if (idx == 0) it[0] + (t - st).toDouble() else it[1] + 1.0 } } } } } fun getAverageTime(startStation: String, endStation: String): Double = outMap["$startStation-$endStation"]!!.let { it[0] / it[1] } }