/*
 * @lc app=leetcode id=3259 lang=java
 *
 * [3259] Maximum Energy Boost From Two Drinks
 */
class Solution { fun maxEnergyBoost(a: IntArray, b: IntArray): Long = a.size.let { n -> LongArray(n).let { da -> LongArray(n).let { db -> (0 until n).forEach { i -> if (i == 0) da[0] = a[0].toLong().run { db[0] = b[0].toLong() } else if (i == 1) da[1] = (a[0] + a[1]).toLong().run { db[1] = (b[0] + b[1]).toLong() } else da[i] = (maxOf(da[i - 1], db[i - 2]) + a[i]).run { db[i] = (maxOf(db[i - 1], da[i - 2]) + b[i]) } }.run { maxOf(da[n - 1], db[n - 1]) } } } } }