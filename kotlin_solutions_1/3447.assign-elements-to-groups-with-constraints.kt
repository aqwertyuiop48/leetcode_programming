/*
 * @lc app=leetcode id=3447 lang=java
 *
 * [3447] Assign Elements to Groups with Constraints
 */
class Solution { fun assignElements(elements: IntArray, groups: IntArray): IntArray = IntArray(100001) { 999999 }.also { m -> groups.forEachIndexed { i, g -> if (m[g] == 999999) m[g] = i } }.let { m -> IntArray(elements.size) { i -> (1..java.lang.Math.sqrt(elements[i].toDouble()).toInt()).filter { elements[i] % it == 0 }.flatMap { listOf(it, elements[i] / it) }.filter { it <= 100000 }.map { m[it] }.minOrNull()?.let { if (it == 999999) -1 else it } ?: -1 } } }