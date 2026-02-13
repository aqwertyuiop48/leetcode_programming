/*
 * @lc app=leetcode id=278 lang=kotlin
 *
 * [278] First Bad Version
 */

class Solution : VersionControl() {override fun firstBadVersion(n: Int) = generateSequence(Triple(1, n, -1)) { (left, right, answer) -> if (left > right) null else (left + (right - left) / 2).let { mid -> if (isBadVersion(mid)) Triple(left, mid - 1, mid) else Triple(mid + 1, right, answer) } }.last().third}