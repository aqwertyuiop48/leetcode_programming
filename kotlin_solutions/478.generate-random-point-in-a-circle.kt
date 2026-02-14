/*
 * @lc app=leetcode id=478 lang=kotlin
 *
 * [478] Generate Random Point in a Circle
 */

class Solution(val radius: Double, val x_center: Double, val y_center: Double) { fun randPoint(): DoubleArray = generateSequence { (Math.random() * 2 - 1) * radius to (Math.random() * 2 - 1) * radius }.first { (dx, dy) -> dx * dx + dy * dy <= radius * radius } .let { (dx, dy) -> doubleArrayOf(x_center + dx, y_center + dy) } }

