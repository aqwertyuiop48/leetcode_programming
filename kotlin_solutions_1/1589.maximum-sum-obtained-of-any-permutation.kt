/*
 * @lc app=leetcode id=1589 lang=kotlin
 *
 * [1589] Maximum Sum Obtained of Any Permutation
 */

class Solution { fun maxSumRangeQuery(nums: IntArray, requests: Array<IntArray>): Int = IntArray(nums.size + 1).apply { requests.forEach { r -> this[r[0]] += 1.also { this[r[1] + 1] -= 1 } } }.let { diff -> diff.asSequence().take(nums.size).scan(0L) { acc, x -> acc + x }.drop(1).sorted().zip(nums.sorted().asSequence().map { it.toLong() }).fold(0L) { acc, p -> (acc + p.first * p.second) % 1000000007 }.toInt() } }