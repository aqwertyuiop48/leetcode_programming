/*
 * @lc app=leetcode id=526 lang=kotlin
 *
 * [526] Beautiful Arrangement
 */

class Solution { fun countArrangement(n: Int): Int = intArrayOf(0).let { result -> Array(n + 1) { mutableSetOf<Int>() }.apply { for (i in 1..n) for (j in 1..n) if (i % j == 0 || j % i == 0) this[i].add(j) }.let { numbers -> object { fun createPerms(i: Int, visited: IntArray) { when { i > n -> {result[0]++} else -> numbers[i].forEach { num -> if (visited[num] == 0) Unit.also { visited[num] = 1 } .run { createPerms(i + 1, visited) } .also { visited[num] = 0 } } } } }.apply { createPerms(1, IntArray(n + 1) { 0 }) } .run{result[0]} } } }
