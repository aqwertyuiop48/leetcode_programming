/*
 * @lc app=leetcode id=1240 lang=kotlin
 *
 * [1240] Tiling a Rectangle with the Fewest Squares
 */
class Solution { fun tilingRectangle(n: Int, m: Int): Int = HashMap<List<Int>, Int>().let { memo -> kotlin.DeepRecursiveFunction<List<Int>, Int> { s -> if (s.all { it == m }) 0 else memo.getOrPut(s) { s.minOrNull()!!.let { minH -> s.indexOf(minH).let { idx -> (0 until s.size - idx).takeWhile { s[idx + it] == minH }.size.let { w -> (minOf(w, m - minH) downTo 1).minOf { len -> 1 + callRecursive(s.toMutableList().apply { (0 until len).forEach { this[idx + it] += len } }.toList()) } } } } } }.invoke(List(n) { 0 }) } }