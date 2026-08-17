/*
 * @lc app=leetcode id=3117 lang=kotlin
 *
 * [3117] Minimum Sum of Values by Dividing Array
 */

class Solution {
    fun minimumValueSum(nums: IntArray, andValues: IntArray): Int = HashMap<Triple<Int, Int, Int>, Int>().let { memo -> DeepRecursiveFunction<Triple<Int, Int, Int>, Int> { (i, j, mask) -> if (j == andValues.size) if (i == nums.size) 0 else 1000000000 else if (i == nums.size) 1000000000 else memo.getOrPut(Triple(i, j, mask)) { (mask and nums[i]).let { nm -> if ((nm and andValues[j]) != andValues[j]) 1000000000 else (if (nm == andValues[j]) nums[i] + callRecursive(Triple(i + 1, j + 1, -1)) else 1000000000).let { res1 -> minOf(res1, callRecursive(Triple(i + 1, j, nm))) } } } }.invoke(Triple(0, 0, -1)).let { if (it >= 1000000000) -1 else it } }
}