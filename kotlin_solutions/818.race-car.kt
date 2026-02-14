/*
 * @lc app=leetcode id=818 lang=kotlin
 *
 * [818] Race Car
 */

class Solution { fun racecar(target: Int): Int = generateSequence(1) { it * 2 }.takeWhile { it <= 4 * target }.toList().let { pw -> mutableMapOf(1 to Array(4 * target) { IntArray(pw.size) { -1 } }, -1 to Array(4 * target) { IntArray(pw.size) { -1 } }).apply { this[1]!![0][0] = 0 }.also { map -> generateSequence(mutableListOf(Triple(0, 0, 1))) { q -> q.removeFirstOrNull()?.let { (p, i, d) -> (p + d * pw[i]).takeIf { it in 0 until 4 * target && map[d]!![it].getOrNull(i + 1) == -1 }?.also { map[d]!![it][i + 1] = 1 + map[d]!![p][i] }?.also { q.add(Triple(it, i + 1, d)) }.run { (map[-d]!![p][0] == -1).takeIf { it }?.also { map[-d]!![p][0] = 1 + map[d]!![p][i] }?.also { q.add(Triple(p, 0, -d)) } }.let { q.takeIf { it.isNotEmpty() } } } }.takeWhile { it != null }.count() }.flatMap { (_, a) -> a[target].asIterable() }.filter { it > 0 }.minOrNull() ?: -1 } }