/*
 * @lc app=leetcode id=421 lang=kotlin
 *
 * [421] Maximum XOR of Two Numbers in an Array
 */

class Solution {fun findMaximumXOR(nums: IntArray): Int = (30 downTo 0).fold(0) { max, i -> (max or (1 shl i)).let { curr -> if (nums.map { it shr i shl i }.toSet().let { prefixes -> prefixes.any { curr xor it in prefixes } }) curr else max } }}

