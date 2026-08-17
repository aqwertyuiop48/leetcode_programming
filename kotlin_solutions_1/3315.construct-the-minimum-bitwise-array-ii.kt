/*
 * @lc app=leetcode id=3315 lang=java
 *
 * [3315] Construct the Minimum Bitwise Array II
 */
fun minBitwiseArray(nums: List<Int>): IntArray = IntArray(nums.size) { i -> nums[i].let { n -> if (n % 2 == 0) -1 else n.inv().let { inv -> n - (((n + 1) and inv) ushr 1) } } }