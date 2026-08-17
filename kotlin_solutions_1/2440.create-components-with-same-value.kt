/*
 * @lc app=leetcode id=2440 lang=kotlin
 *
 * [2440] Create Components With Same Value
 */
class Solution { fun componentValue(nums: IntArray, edges: Array<IntArray>): Int = nums.sum().let { sum -> Array(nums.size) { mutableListOf<Int>() }.apply { edges.forEach { e -> get(e[0]).add(e[1]).also { get(e[1]).add(e[0]) } } }.let { adj -> (nums.size downTo 1).filter { sum % it == 0 }.first { k -> (sum / k).let { target -> kotlin.DeepRecursiveFunction<Pair<Int, Int>, Int> { (u, p) -> adj[u].fold(nums[u]) { acc, v -> if (v == p) acc else callRecursive(v to u).let { if (it < 0 || acc < 0) -1000000000 else acc + it } }.let { s -> if (s > target) -1000000000 else if (s == target) 0 else s } }.callRecursive(0 to -1) == 0 } }.let { it - 1 } } }