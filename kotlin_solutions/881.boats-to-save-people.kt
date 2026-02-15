/*
 * @lc app=leetcode id=881 lang=kotlin
 *
 * [881] Boats to Save People
 */

class Solution { fun numRescueBoats(people: IntArray, limit: Int) = people.sorted().let { sorted -> generateSequence(0 to sorted.lastIndex to 0) { (range, boats) -> when { range.first > range.second -> {null} sorted[range.first] + sorted[range.second] <= limit -> {(range.first + 1 to range.second - 1) to (boats + 1)} else -> (range.first to range.second - 1) to (boats + 1) } }.last().second } }