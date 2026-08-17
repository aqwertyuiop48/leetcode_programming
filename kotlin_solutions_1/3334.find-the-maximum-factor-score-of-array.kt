/*
 * @lc app=leetcode id=3334 lang=java
 *
 * [3334] Find the Maximum Factor Score of Array
 */
fun maxScore(nums: IntArray): Long = fun(a: Long, b: Long): Long = generateSequence(a to b) { it.second to it.first % it.second }.first { it.second == 0L }.first.let { g -> if (nums.isEmpty()) 0L else ((-1 until nums.size).map { i -> nums.indices.filter { it != i }.map { nums[it].toLong() }.let { s -> if (s.isEmpty()) 0L else s.reduce { x, y -> g(x, y) }.let { gd -> s.reduce { x, y -> (x / g(x, y)) * y } * gd } } }.maxOrNull() ?: 0L) }