/*
 * @lc app=leetcode id=2183 lang=kotlin
 *
 * [2183] Count Array Pairs Divisible by K
 */
class Solution { fun countPairs(nums: IntArray, k: Int): Long = kotlin.DeepRecursiveFunction<Pair<Int, Int>, Int> { (a, b) -> if (b == 0) a else callRecursive(b to a % b) }.let { gcd -> LongArray(k + 1).let { cnt -> nums.forEach { x -> cnt[gcd.invoke(x to k)]++ }.run { (1..k).filter { cnt[it] > 0 }.toIntArray().let { divs -> longArrayOf(0L).let { ans -> divs.forEachIndexed { i, d1 -> (i until divs.size).forEach { j -> divs[j].let { d2 -> if (d1.toLong() * d2 % k == 0L) ans.set(0, ans[0] + if (d1 == d2) cnt[d1] * (cnt[d1] - 1) / 2 else cnt[d1] * cnt[d2]) } } }.run { ans[0] } } } } } }