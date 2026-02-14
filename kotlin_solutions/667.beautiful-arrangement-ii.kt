/*
 * @lc app=leetcode id=667 lang=kotlin
 *
 * [667] Beautiful Arrangement II
 */

class Solution {fun constructArray(n: Int, k: Int): IntArray =IntArray(n) { i -> if (i <= k) if (i % 2 == 0) i / 2 + 1 else k - i / 2 + 1 else i + 1 }}

