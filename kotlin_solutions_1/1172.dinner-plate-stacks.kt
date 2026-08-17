/*
 * @lc app=leetcode id=1172 lang=kotlin
 *
 * [1172] Dinner Plate Stacks
 */

class DinnerPlates(val capacity: Int, val l: MutableList<ArrayDeque<Int>> = mutableListOf(), val s: java.util.TreeSet<Int> = java.util.TreeSet()) { fun push(`val`: Int) = run { generateSequence { s.firstOrNull()?.takeIf { it >= l.size }?.also { s.pollFirst() } }.lastOrNull().also { if (s.isEmpty()) l.add(ArrayDeque<Int>()).also { s.add(l.size - 1) } }.also { s.first().let { idx -> l[idx].add(`val`).also { if (l[idx].size == capacity) s.remove(idx) } } } } fun pop(): Int = run { popAtStack(l.size - 1) } fun popAtStack(index: Int): Int = run { if (index !in l.indices || l[index].isEmpty()) -1 else l[index].removeLast().also { s.add(index) }.also { generateSequence { l.lastOrNull()?.takeIf { it.isEmpty() }?.also { s.remove(l.size - 1).also { l.removeAt(l.size - 1) } } }.lastOrNull() } } }