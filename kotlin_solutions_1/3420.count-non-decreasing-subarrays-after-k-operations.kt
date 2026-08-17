/*
 * @lc app=leetcode id=3420 lang=kotlin
 *
 * [3420] Count Non-Decreasing Subarrays After K Operations
 */

class Solution {
    fun countNonDecreasingSubarrays(nums: IntArray, k: Long): Long = ({ s: LongArray -> ({ st: IntArray -> ({ ht: IntArray -> (nums.indices).map { right -> longArrayOf(generateSequence { 0 }.takeWhile { ht[1] > ht[0] && nums[nums.size - 1 - st[ht[1] - 1]] < nums[nums.size - 1 - right] }.map { (s[0] - 1L * (st[ht[1] - 1] - (if (ht[1] > ht[0] + 1) st[ht[1] - 2] else s[1].toInt() - 1)) * (nums[nums.size - 1 - right] - nums[nums.size - 1 - st[ht[1] - 1]])).also { s[0] = it }.also { ht[1]-- }.let { 1L } }.sum(), st[ht[1]++].let { st[ht[1] - 1] = right }.let { 0L }, generateSequence { 0 }.takeWhile { s[0] < 0 }.map { (s[0] + nums[nums.size - 1 - st[ht[0]]] - nums[nums.size - 1 - s[1].toInt()]).also { s[0] = it }.also { if (st[ht[0]] == s[1].toInt()) ht[0]++ }.also { s[1]++ }.let { 1L } }.sum(), (right - s[1].toInt() + 1).toLong())[3] }.sum() })(IntArray(2)) })(IntArray(nums.size)) })(longArrayOf(k, 0L))
}