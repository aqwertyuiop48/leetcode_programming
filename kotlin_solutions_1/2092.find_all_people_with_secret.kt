/*
 * @lc app=leetcode id=2092 lang=kotlin
 *
 * [2092] Find All People With Secret
 */

class Solution {
    fun findAllPeople(n: Int, meetings: Array<IntArray>, firstPerson: Int): List<Int> = IntArray(n) { it }.apply { set(0, 0).also { set(firstPerson, 0) } }.let { p -> meetings.sortedBy { it[2] }.groupBy { it[2] }.values.forEach { m -> m.flatMap { it.take(2).toList() }.toSet().let { people -> m.forEach { (u, v) -> { x: Int -> generateSequence(x) { p[it] }.first { p[it] == it } }.let { find -> find(u).let { ru -> find(v).let { rv -> if (ru == 0 || rv == 0) p.set(ru, 0).also { p.set(rv, 0) } else p.set(ru, rv) } } } }.also { people.forEach { if ({ x: Int -> generateSequence(x) { p[it] }.first { p[it] == it } }(it) != 0) p.set(it, it) } } } }.let { (0 until n).filter { { x: Int -> generateSequence(x) { p[it] }.first { p[it] == it } }(it) == 0 } }
}