/*
 * @lc app=leetcode id=3277 lang=java
 *
 * [3277] Maximum XOR Score Subarray Queries
 */
class Solution { fun maximumSubarrayXor(nums: IntArray, queries: Array<IntArray>): IntArray = nums.size.let { n -> Array(n) { IntArray(n) }.apply { (0 until n).forEach { i -> this[i][i] = nums[i] } }.apply { (2..n).forEach { len -> (0..n - len).forEach { i -> (i + len - 1).let { j -> this[i][j] = this[i][j - 1] xor this[i + 1][j] } } } }.let { f -> Array(n) { IntArray(n) }.apply { (0 until n).forEach { i -> this[i][i] = f[i][i] } }.apply { (2..n).forEach { len -> (0..n - len).forEach { i -> (i + len - 1).let { j -> this[i][j] = maxOf(f[i][j], maxOf(this[i][j - 1], this[i + 1][j])) } } } }.let { g -> IntArray(queries.size) { i -> g[queries[i][0]][queries[i][1]] } } } } }