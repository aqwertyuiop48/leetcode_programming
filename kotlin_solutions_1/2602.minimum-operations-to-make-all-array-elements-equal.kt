/* @lc app=leetcode id=2602 lang=kotlin */
class Solution {
    fun minOperations(nums: IntArray, queries: IntArray): List<Long> = nums.sortedArray().let { s -> LongArray(s.size + 1).also { p -> s.forEachIndexed { i, v -> p.set(i + 1, p[i] + v) } }.let { p -> queries.map { q -> java.util.Arrays.binarySearch(s, q).let { r -> (if (r < 0) -r - 1 else r).let { i -> (q.toLong() * i - p[i]) + (p[s.size] - p[i] - q.toLong() * (s.size - i)) } } } } }
}