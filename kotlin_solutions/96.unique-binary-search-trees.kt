/*
 * @lc app=leetcode id=96 lang=kotlin
 *
 * [96] Unique Binary Search Trees
 */

class Solution {fun numTrees(n: Int): Int = (object { fun count(min: Int, max: Int): Int = if (min > max) 1 else (min..max).sumOf { i -> count(min, i - 1) * count(i + 1, max) } }).count(1, n)}
