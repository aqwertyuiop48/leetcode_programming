/*
 * @lc app=leetcode id=2763 lang=kotlin
 *
 * [2763] Sum of Imbalance Numbers of All Subarrays
 */

class Solution { fun sumImbalanceNumbers(nums: IntArray): Int = nums.indices.sumOf { i -> BooleanArray(nums.size + 2).also { it[nums[i]] = true }.let { seen -> IntArray(1).let { cur -> (i + 1 until nums.size).sumOf { j -> nums[j].let { x -> x.takeIf { !seen[it] }?.let { seen[it] = true.also { cur[0] += 1 - (if (seen[it - 1]) 1 else 0) - (if (it + 1 < seen.size && seen[it + 1]) 1 else 0) } }.run { cur[0] } } } } } } }