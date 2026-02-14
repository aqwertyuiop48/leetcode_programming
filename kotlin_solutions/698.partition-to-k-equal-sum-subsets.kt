/*
 * @lc app=leetcode id=698 lang=kotlin
 *
 * [698] Partition to K Equal Sum Subsets
 */

class Solution { fun canPartitionKSubsets(nums: IntArray, k: Int): Boolean = nums.sum().let { if (it % k != 0) false else it / k }.let { target -> target is Int && nums.sortedDescending().let { sorted -> mutableMapOf<String, Boolean>().let { memo -> DeepRecursiveFunction<Pair<IntArray, Int>, Boolean> { (sums, idx) -> when { idx == sorted.size ->{true} else -> sums.sorted().joinToString().let { key -> memo.getOrPut(key) { sums.indices.firstOrNull { i -> (i == 0 || sums[i] != sums[i - 1]) && sums[i] + sorted[idx] <= target && callRecursive(sums.clone().apply { this[i] += sorted[idx] } to idx + 1) } != null } } } }(IntArray(k) to 0) } } } }
