/*
 * @lc app=leetcode id=3412 lang=java
 *
 * [3412] Find Mirror Score of a String
 */

fun calculateScore(s: String): Long = mutableMapOf<Int, MutableList<Int>>().let { st -> s.indices.fold(0L) { acc, i -> (s[i] - 'a').let { c -> (25 - c).let { m -> if (st[m]?.isNotEmpty() == true) acc + (i - st[m]!!.removeAt(st[m]!!.size - 1)) else acc.also { st.computeIfAbsent(c) { mutableListOf() }.add(i) } } } } }