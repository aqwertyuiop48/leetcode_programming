/*
 * @lc app=leetcode id=2407 lang=kotlin
 *
 * [2407] Longest Increasing Subsequence II
 */

class Solution { fun lengthOfLIS(nums: IntArray, k: Int): Int = 100005.let { n -> IntArray(2 * n).let { tree -> nums.fold(0) { maxAns, x -> maxOf(1, x - k).let { l -> (x - 1).let { r -> (if (l <= r) intArrayOf(l + n, r + n + 1, 0).let { s -> generateSequence { if (s[0] < s[1]) s else null }.forEach { _ -> (if (s[0] % 2 == 1) run { s[2] = maxOf(s[2], tree[s[0]]) }.run { s[0]++ } else Unit).run { if (s[1] % 2 == 1) run { s[1]-- }.run { s[2] = maxOf(s[2], tree[s[1]]) } else Unit }.run { s[0] /= 2 }.run { s[1] /= 2 } }.let { s[2] } } else 0).let { maxPrev -> (maxPrev + 1).let { curLen -> tree.set(x + n, curLen).run { generateSequence(x + n) { if (it > 1) it / 2 else null }.drop(1).forEach { i -> tree[i] = maxOf(tree[2 * i], tree[2 * i + 1]) } }.run { maxOf(maxAns, curLen) } } } } } } } }