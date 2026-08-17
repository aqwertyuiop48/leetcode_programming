/*
 * @lc app=leetcode id=1710 lang=kotlin
 *
 * [1710] Maximum Units on a Truck
 */

class Solution {
    fun maximumUnits(boxTypes: Array<IntArray>, truckSize: Int): Int = boxTypes.sortedByDescending { it[1] }.fold(0 to truckSize) { (units, cap), box -> minOf(box[0], cap).let { take -> (units + take * box[1]) to (cap - take) } }.first
}