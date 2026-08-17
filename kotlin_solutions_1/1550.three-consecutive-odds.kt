/*
 * @lc app=leetcode id=1550 lang=kotlin
 *
 * [1550] Three Consecutive Odds
 */

class Solution { fun threeConsecutiveOdds(arr: IntArray): Boolean = (0..arr.size - 3).any { arr[it] % 2 != 0 && arr[it + 1] % 2 != 0 && arr[it + 2] % 2 != 0 } }