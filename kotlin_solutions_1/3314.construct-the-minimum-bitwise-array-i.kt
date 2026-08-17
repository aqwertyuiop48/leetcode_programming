/*
 * @lc app=leetcode id=3314 lang=java
 *
 * [3314] Construct the Minimum Bitwise Array I
 */

fun minBitwiseArray(nums: List<Int>): IntArray = nums.map { p -> if (p == 2) -1 else (0..30).first { i -> (p shr i) and 1 == 0 }.let { i -> p xor (1 shl (i - 1)) } }.toIntArray()