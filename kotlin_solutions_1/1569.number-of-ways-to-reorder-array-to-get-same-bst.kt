/*
 * @lc app=leetcode id=1569 lang=kotlin
 *
 * [1569] Number of Ways to Reorder Array to Get Same BST
 */

class Solution {
    fun numOfWays(nums: IntArray): Int = Array(nums.size + 1) { LongArray(nums.size + 1) }.apply { indices.forEach { i -> this[i][0] = 1L.also { (1..i).forEach { j -> this[i][j] = (this[i - 1][j - 1] + this[i - 1][j]) % 1000000007 } } } }.let { comb -> DeepRecursiveFunction<List<Int>, Long> { list -> if (list.size <= 2) 1L else list.drop(1).partition { it < list[0] }.let { (left, right) -> (((comb[left.size + right.size][left.size] * callRecursive(left)) % 1000000007) * callRecursive(right)) % 1000000007 } }(nums.toList()).let { (it - 1 + 1000000007) % 1000000007 }.toInt() }
}