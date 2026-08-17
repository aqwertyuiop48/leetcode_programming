/*
 * @lc app=leetcode id=3273 lang=java
 *
 * [3273] Minimum Amount of Damage Dealt to Bob
 */

class Solution {
    fun minDamage(power: Int, d: IntArray, h: IntArray): Long = d.indices.map { it to (h[it] + power - 1) / power }.sortedWith { a, b -> (b.first.toLong() * a.second).compareTo(a.first.toLong() * b.second) }.fold(0L to 0L) { (total, time), p -> (total + (time + p.second) * p.first) to (time + p.second) }.first
}