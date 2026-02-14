/*
 * @lc app=leetcode id=475 lang=kotlin
 *
 * [475] Heaters
 */

class Solution { fun findRadius(houses: IntArray, heaters: IntArray): Int = houses.sorted().let { sortedHouses -> heaters.sorted().let { sortedHeaters -> sortedHouses.maxOf { house -> sortedHeaters.binarySearch(house).let { idx -> when { idx >= 0 -> {0} else -> (-idx - 1).let { pos -> minOf( if (pos > 0) house - sortedHeaters[pos - 1] else Int.MAX_VALUE, if (pos < sortedHeaters.size) sortedHeaters[pos] - house else Int.MAX_VALUE ) } } } } } } }