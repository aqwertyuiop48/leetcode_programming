/*
 * @lc app=leetcode id=739 lang=kotlin
 *
 * [739] Daily Temperatures
 */

class Solution { fun dailyTemperatures(temperatures: IntArray): IntArray = IntArray(temperatures.size).apply { mutableListOf<Int>().let { stack -> temperatures.indices.forEach { i -> generateSequence { stack.lastOrNull()?.takeIf { temperatures[it] < temperatures[i] } }.forEach { idx -> stack.removeLast().let { this[it] = i - it } } .run{stack.add(i)} } } } }