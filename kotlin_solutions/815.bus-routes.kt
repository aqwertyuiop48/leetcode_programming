/*
 * @lc app=leetcode id=815 lang=kotlin
 *
 * [815] Bus Routes
 */

class Solution { fun numBusesToDestination(routes: Array<IntArray>, source: Int, target: Int): Int = if (source == target) 0 else routes.flatMapIndexed { i, r -> r.map { it to i } }.groupBy({ it.first }, { it.second }).let { m -> generateSequence(listOf(source) to setOf(source) to setOf<Int>()) { (qv, ur) -> qv.first.flatMap { (m[it] ?: emptyList()).filterNot { it in ur } }.distinct().let { nr -> nr.flatMap { routes[it].asIterable() }.filterNot { it in qv.second }.distinct().takeIf { it.isNotEmpty() }?.let { (it to (qv.second + it)) to (ur + nr) } } }.indexOfFirst { target in it.first.first }.takeIf { it >= 0 } ?: -1 } }
