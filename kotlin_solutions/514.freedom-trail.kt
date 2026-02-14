/*
 * @lc app=leetcode id=514 lang=kotlin
 *
 * [514] Freedom Trail
 */

class Solution { private fun calcDist(from: Int, to: Int, length: Int) = abs(from - to).let { directDist -> min(directDist, length - directDist) } fun findRotateSteps(ring: String, key: String) = IntArray(ring.length) { Int.MAX_VALUE / 2 }.also { prev -> ring.indices.forEach { ringIndex -> if (key[0] == ring[ringIndex]) prev[ringIndex] = calcDist(0, ringIndex, ring.length) + 1 } .also{ (1 until key.length).forEach { keyIndex -> IntArray(ring.length) { Int.MAX_VALUE / 2 }.also { next -> ring.indices.forEach { ringIndex -> if (key[keyIndex] == ring[ringIndex]) ring.indices.forEach { prevRingIndex -> next[ringIndex] = min(next[ringIndex], prev[prevRingIndex] + calcDist(prevRingIndex, ringIndex, ring.length) + 1) } } }.copyOf().also { prev.indices.forEach { i -> prev[i] = it[i] } } } } }.minOf { it } }
