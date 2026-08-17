/*
 * @lc app=leetcode id=3410 lang=java
 *
 * [3410] Maximize Subarray Sum After Removing All Occurrences of One Element
 */

fun maxSubarraySum(arr: IntArray): Long = arr.map { it.toLong() }.let { a -> a.indices.fold(0L to Long.MIN_VALUE) { (cur, max), i -> maxOf(0, cur + a[i]).let { it to maxOf(max, it) } }.let { base -> if (base.second == 0L) a.maxOrNull() ?: 0L else arr.toSet().maxOf { x -> arr.map { if (it == x) 0L else it.toLong() }.let { b -> b.indices.fold(0L to Long.MIN_VALUE) { (cur, max), i -> maxOf(0, cur + b[i]).let { it to maxOf(max, it) } }.second } } } }