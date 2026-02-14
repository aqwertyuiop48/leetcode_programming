/*
 * @lc app=leetcode id=673 lang=kotlin
 *
 * [673] Number of Longest Increasing Subsequence
 */

class Solution { fun findNumberOfLIS(nums: IntArray): Int = nums.indices.fold(IntArray(nums.size) { 1 } to IntArray(nums.size) { 1 }) { (len, cnt), i -> (0 until i).filter { nums[it] < nums[i] }.forEach { j -> when { len[j] + 1 > len[i] -> {len[i] = len[j] + 1.also { cnt[i] = cnt[j] }} len[j] + 1 == len[i] -> {cnt[i] += cnt[j]} } } .run{len to cnt} }.let { (len, cnt) -> len.max()!!.let { max -> cnt.indices.filter { len[it] == max }.sumOf { cnt[it] } } } }
