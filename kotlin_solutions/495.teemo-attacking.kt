/*
 * @lc app=leetcode id=495 lang=kotlin
 *
 * [495] Teemo Attacking
 */

class Solution { fun findPoisonedDuration(timeSeries: IntArray, duration: Int): Int = timeSeries.asSequence().zipWithNext().sumOf { (a, b) -> minOf(b - a, duration) } + duration }