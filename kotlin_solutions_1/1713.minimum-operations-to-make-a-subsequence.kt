/*
 * @lc app=leetcode id=1713 lang=kotlin
 *
 * [1713] Minimum Operations to Make a Subsequence
 */

class Solution {
    fun minOperations(target: IntArray, arr: IntArray): Int = target.indices.associateBy { target[it] }.let { pos -> IntArray(arr.size).let { lis -> arr.mapNotNull { pos[it] }.fold(0) { len, x -> java.util.Arrays.binarySearch(lis, 0, len, x).let { idx -> if (idx < 0) -idx - 1 else idx }.also { i -> lis[i] = x }.let { i -> if (i == len) len + 1 else len } }.let { target.size - it } } }
}