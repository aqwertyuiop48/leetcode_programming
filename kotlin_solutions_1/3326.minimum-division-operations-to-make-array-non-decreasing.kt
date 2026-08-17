/*
 * @lc app=leetcode id=3326 lang=java
 *
 * [3326] Minimum Division Operations to Make Array Non Decreasing
 */
fun minOperations(nums: IntArray): Int = IntArray(1000001).also { spf -> (2..1000).forEach { i -> if (spf[i] == 0) (i * i..1000000 step i).forEach { j -> if (spf[j] == 0) spf[j] = i } } }.let { spf -> IntArray(1).also { res -> (nums.size - 2 downTo 0).forEach { i -> if (res[0] != -1) if (nums[i] > nums[i + 1]) (if (spf[nums[i]] == 0) nums[i] else spf[nums[i]]).let { d -> if (d > nums[i + 1]) res.also { it[0] = -1 } else nums.also { it[i] = d }.run { res[0]++ } } } }.let { if (it[0] == -1) -1 else it[0] } }