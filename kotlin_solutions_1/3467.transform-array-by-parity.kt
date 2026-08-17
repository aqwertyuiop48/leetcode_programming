/*
 * @lc app=leetcode id=3467 lang=java
 *
 * [3467] Transform Array by Parity
 */
class Solution { fun transformArray(nums: IntArray): IntArray = nums.map { it % 2 }.sorted().toIntArray() }