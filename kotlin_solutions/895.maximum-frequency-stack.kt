/*
 * @lc app=leetcode id=895 lang=kotlin
 *
 * [895] Maximum Frequency Stack
 */

class FreqStack( private val freq: MutableMap<Int, Int> = mutableMapOf(), private val group: MutableMap<Int, ArrayDeque<Int>> = mutableMapOf(), private var maxFreq: Int = 0 ) { fun push(`val`: Int) = freq.compute(`val`) { _, v -> (v ?: 0) + 1 }!!.also { f -> maxFreq = maxOf(maxFreq, f) }.let { f -> group.getOrPut(f) { ArrayDeque() }.addLast(`val`) } fun pop() = group[maxFreq]!!.removeLast().also { v -> freq[v] = freq[v]!! - 1 }.also { if (group[maxFreq]!!.isEmpty()) maxFreq-- } }

