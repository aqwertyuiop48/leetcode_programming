/*
 * @lc app=leetcode id=3043 lang=kotlin
 *
 * [3043] Find the Length of the Longest Common Prefix
 */

class Solution { fun longestCommonPrefix(arr1: IntArray, arr2: IntArray): Int = arr1.flatMap { generateSequence(it) { x -> if (x > 0) x / 10 else null }.takeWhile { x -> x > 0 } }.toSet().let { set -> arr2.maxOfOrNull { generateSequence(it) { x -> if (x > 0) x / 10 else null }.takeWhile { x -> x > 0 }.firstOrNull { x -> x in set }?.toString()?.length ?: 0 } ?: 0 } }