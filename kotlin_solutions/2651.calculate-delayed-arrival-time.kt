/*
 * @lc app=leetcode id=2651 lang=kotlin
 *
 * [2651] Calculate Delayed Arrival Time
 */

class Solution { fun findDelayedArrivalTime(arrivalTime: Int, delayedTime: Int): Int { return (arrivalTime + delayedTime)%24 } }
