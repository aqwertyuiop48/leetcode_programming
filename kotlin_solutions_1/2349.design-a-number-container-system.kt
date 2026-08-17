/* @lc app=leetcode id=2349 lang=kotlin */
class NumberContainers(val m: MutableMap<Int, Int> = mutableMapOf(), val t: MutableMap<Int, java.util.TreeSet<Int>> = mutableMapOf()) {
    fun change(index: Int, number: Int) = m[index]?.let { t[it]?.remove(index) }.run { m[index] = number }.run { t.getOrPut(number) { java.util.TreeSet() }.add(index) }
    fun find(number: Int) = t[number]?.firstOrNull() ?: -1
}