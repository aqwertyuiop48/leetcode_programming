/*
 * @lc app=leetcode id=3134 lang=kotlin
 *
 * [3134] Find the Median of the Uniqueness Array
 */

class Solution { fun medianOfUniquenessArray(nums: IntArray): Int = (nums.size.toLong() * (nums.size + 1) / 2).let { total -> (total + 1) / 2 }.let { target -> generateSequence(1 to nums.size) { (l, r) -> if (l < r) ((l + r) / 2).let { mid -> if (IntArray(100005).let { freq -> nums.indices.fold(Triple(0, 0, 0L)) { (left, diff, cnt), right -> (diff + if (freq[nums[right]]++ == 0) 1 else 0).let { d1 -> generateSequence(left to d1) { (l2, d2) -> if (d2 > mid) (l2 + 1) to (d2 - if (--freq[nums[l2]] == 0) 1 else 0) else null }.last().let { (fl, fd) -> Triple(fl, fd, cnt + (right - fl + 1)) } } }.third } >= target) l to mid else (mid + 1) to r } else null }.last().first } }