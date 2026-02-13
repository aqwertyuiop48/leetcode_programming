/*
 * @lc app=leetcode id=215 lang=kotlin
 *
 * [215] Kth Largest Element in an Array
 */

class Solution {fun findKthLargest(nums: IntArray, k: Int): Int =nums.sortedDescending()[k - 1]}

