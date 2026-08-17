/*
 * @lc app=leetcode id=952 lang=kotlin
 *
 * [952] Largest Component Size by Common Factor
 */

class Solution {
    fun largestComponentSize(nums: IntArray): Int = IntArray(100005) { it }.let { parent -> IntArray(100005).let { count -> { i: Int -> generateSequence(i) { parent[it].takeIf { p -> p != it } }.toList().let { path -> path.onEach { parent[it] = path.last() }.last() } }.let { find -> nums.forEach { num -> (2..num).asSequence().takeWhile { it * it <= num }.filter { num % it == 0 }.forEach { f -> listOf(f, num / f).forEach { fac -> find(num).let { rA -> find(fac).let { rB -> if (rA != rB) parent[rA] = rB } } } } }.let { nums.maxOf { ++count[find(it)] } } } } }
}