/*
 * @lc app=leetcode id=2276 lang=kotlin
 *
 * [2276] Count Integers in Intervals
 */

class CountIntervals(val map: java.util.TreeMap<Int, Int> = java.util.TreeMap(), var cnt: Int = 0) { fun add(left: Int, right: Int) = intArrayOf(left, right).let { v -> generateSequence { map.floorEntry(v[1])?.takeIf { it.value >= v[0] } }.forEach { cur -> run { cnt -= cur.value - cur.key + 1 }.run { v[0] = minOf(v[0], cur.key) }.run { v[1] = maxOf(v[1], cur.value) }.run { map.remove(cur.key) } }.run { map[v[0]] = v[1] }.run { cnt += v[1] - v[0] + 1 } } fun count(): Int = cnt }