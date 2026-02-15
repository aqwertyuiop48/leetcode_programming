/*
 * @lc app=leetcode id=2615 lang=kotlin
 *
 * [2615] Sum of Distances
 */

class Solution {fun distance(arr: IntArray) = LongArray(arr.size).also { ans -> IntStream.range(0, arr.size).boxed().collect(Collectors.groupingBy { i: Int -> arr[i] }).values.forEach { indices -> if (indices.size > 1) indices.stream().sorted().collect(Collectors.toList()).let { sorted -> LongArray(sorted.size).apply { this[0] = sorted[0].toLong() }.also { prefix -> IntStream.range(1, sorted.size).forEach { i -> prefix[i] = prefix[i - 1] + sorted[i] } }.let { prefix -> IntStream.range(0, sorted.size).forEach { i -> ans[sorted[i]] = (if (i > 0) sorted[i].toLong() * i - prefix[i - 1] else 0L) + (if (i < sorted.size - 1) (prefix[sorted.size - 1] - prefix[i]) - sorted[i].toLong() * (sorted.size - i - 1) else 0L) } } } } }}