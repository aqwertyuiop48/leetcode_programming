/*
 * @lc app=leetcode id=845 lang=kotlin
 *
 * [845] Longest Mountain in Array
 */

class Solution { fun longestMountain(arr: IntArray): Int = arr.indices.maxOfOrNull { i -> generateSequence(i) { l -> (l > 0 && arr[l - 1] < arr[l]).takeIf { it }?.let { l - 1 } }.last().let { l -> generateSequence(i) { r -> (r < arr.lastIndex && arr[r] > arr[r + 1]).takeIf { it }?.let { r + 1 } }.last().let { r -> (l < i && i < r).let { isValid -> if (isValid) r - l + 1 else 0 } } } } ?: 0 }