/*
 * @lc app=leetcode id=3068 lang=kotlin
 *
 * [3068] Find the Maximum Sum of Node Values
 */

class Solution { fun maximumValueSum(nums: IntArray, k: Int, edges: Array<IntArray>): Long = nums.fold(Triple(0L, 0, Long.MAX_VALUE)) { (sum, cnt, minDiff), x -> Triple(sum + maxOf(x, x xor k), cnt + if ((x xor k) > x) 1 else 0, minOf(minDiff, Math.abs(x.toLong() - (x xor k)))) }.let { (sum, cnt, minDiff) -> if (cnt % 2 == 0) sum else sum - minDiff } }