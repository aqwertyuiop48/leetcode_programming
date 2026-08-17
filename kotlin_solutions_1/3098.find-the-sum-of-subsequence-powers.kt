/*
 * @lc app=leetcode id=3098 lang=kotlin
 *
 * [3098] Find the Sum of Subsequence Powers
 */

class Solution { fun sumOfPowers(nums: IntArray, k: Int): Int = nums.sorted().let { a -> (0 until a.size).flatMap { i -> (i + 1 until a.size).map { j -> a[j] - a[i] } }.distinct().sorted().let { diffs -> diffs.indices.fold(0L) { acc, idx -> diffs[idx].let { d -> IntArray(a.size) { i -> (0 until i).lastOrNull { j -> a[i] - a[j] >= d } ?: -1 }.let { last -> (2..k).fold(LongArray(a.size) { 1L }.scan(0L) { s, x -> (s + x) % 1000000007L }.drop(1).toLongArray()) { prevPref, _ -> LongArray(a.size) { i -> if (last[i] >= 0) prevPref[last[i]] else 0L }.scan(0L) { s, x -> (s + x) % 1000000007L }.drop(1).toLongArray() }[a.size - 1].let { count -> (acc + count * (d - if (idx > 0) diffs[idx - 1] else 0)) % 1000000007L } } } }.toInt() } } }