/*
 * @lc app=leetcode id=3375 lang=java
 *
 * [3375] Minimum Operations to Make Array Values Equal to K
 */

fun minOperations(nums: IntArray, k: Int): Int = if (nums.any { it < k }) -1 else nums.filter { it > k }.distinct().size