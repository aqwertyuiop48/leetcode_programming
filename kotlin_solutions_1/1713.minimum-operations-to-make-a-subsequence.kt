/*
 * @lc app=leetcode id=1713 lang=kotlin
 *
 * [1713] Minimum Operations to Make a Subsequence
 */

class Solution { fun minOperations(target: IntArray, arr: IntArray): Int = target.indices.associate { target[it] to it }.let { positions -> IntArray(arr.size).let { tails -> arr.asSequence().mapNotNull { positions[it] }.fold(0) { length, value -> java.util.Arrays.binarySearch(tails, 0, length, value).let { if (it < 0) -it - 1 else it }.let { index -> tails.also { it[index] = value }.let { maxOf(length, index + 1) } } }.let { target.size - it } } } }