/*
 * @lc app=leetcode id=453 lang=kotlin
 *
 * [453] Minimum Moves to Equal Array Elements
 */

class Solution {fun minMoves(nums: IntArray): Int =nums.sum() - nums.min()!! * nums.size}