/*
 * @lc app=leetcode id=1184 lang=kotlin
 *
 * [1184] Distance Between Bus Stops
 */

class Solution { fun distanceBetweenBusStops(distance: IntArray, start: Int, destination: Int): Int = minOf(start, destination).let { a -> maxOf(start, destination).let { b -> distance.sliceArray(a until b).sum().let { d -> minOf(d, distance.sum() - d) } } } }