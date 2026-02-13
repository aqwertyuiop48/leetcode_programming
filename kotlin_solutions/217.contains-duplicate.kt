/*
 * @lc app=leetcode id=217 lang=kotlin
 *
 * [217] Contains Duplicate
 */

class Solution {fun containsDuplicate(nums: IntArray): Boolean =nums.toSet().size != nums.size}
