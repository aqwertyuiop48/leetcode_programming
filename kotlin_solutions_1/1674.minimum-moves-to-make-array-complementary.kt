/*
 * @lc app=leetcode id=1674 lang=kotlin
 *
 * [1674] Minimum Moves to Make Array Complementary
 */

class Solution { fun minMoves(nums: IntArray, limit: Int): Int = IntArray(limit * 2 + 2).also { diff -> (0 until nums.size / 2).forEach { i -> minOf(nums[i], nums[nums.size - 1 - i]).let { a -> maxOf(nums[i], nums[nums.size - 1 - i]).let { b -> diff[2].also { diff[2] += 2 }.run { diff[a + 1] -= 1 }.run { diff[a + b] -= 1 }.run { diff[a + b + 1] += 1 }.run { diff[b + limit + 1] += 1 } } } } }.let { diff -> (2..limit * 2).fold(Pair(0, Int.MAX_VALUE)) { (curr, minVal), x -> (curr + diff[x]).let { newCurr -> Pair(newCurr, minOf(minVal, newCurr)) } }.second } }