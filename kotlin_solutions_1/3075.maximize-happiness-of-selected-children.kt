/*
 * @lc app=leetcode id=3075 lang=kotlin
 *
 * [3075] Maximize Happiness of Selected Children
 */

class Solution { fun maximumHappinessSum(happiness: IntArray, k: Int): Long = happiness.sortedDescending().take(k).foldIndexed(0L) { i, acc, h -> acc + maxOf(0, h - i) } }