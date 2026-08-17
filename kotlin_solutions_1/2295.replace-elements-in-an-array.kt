/*
 * @lc app=leetcode id=2295 lang=kotlin
 *
 * [2295] Replace Elements in an Array
 */

class Solution { fun arrayChange(nums: IntArray, operations: Array<IntArray>): IntArray = HashMap<Int, Int>().apply { nums.indices.forEach { i -> put(nums[i], i) } }.let { map -> operations.forEach { op -> map.remove(op[0])!!.let { idx -> run { nums[idx] = op[1] }.run { map[op[1]] = idx } } }.run { nums } } }