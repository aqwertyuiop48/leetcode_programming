/*
 * @lc app=leetcode id=365 lang=kotlin
 *
 * [365] Water and Jug Problem
 */

class Solution { fun canMeasureWater(jug1Capacity: Int, jug2Capacity: Int, targetCapacity: Int): Boolean = targetCapacity == 0 || (targetCapacity <= jug1Capacity + jug2Capacity && targetCapacity % gcd(jug1Capacity, jug2Capacity) == 0) fun gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b) }
