/*
 * @lc app=leetcode id=769 lang=kotlin
 *
 * [769] Max Chunks To Make Sorted
 */

class Solution { fun maxChunksToSorted(arr: IntArray) = arr.indices.fold(-1 to 0) { (max, split), i -> maxOf(max, arr[i]).let { newMax -> newMax to (split + if (newMax == i) 1 else 0) } }.second }