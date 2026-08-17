/* @lc app=leetcode id=1877 lang=kotlin */
class Solution { fun minPairSum(nums: IntArray): Int = nums.sorted().let { a -> (0 until a.size / 2).maxOf { i -> a[i] + a[a.size - 1 - i] } } }