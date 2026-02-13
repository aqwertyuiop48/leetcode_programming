/*
 * @lc app=leetcode id=341 lang=kotlin
 *
 * [341] Flatten Nested List Iterator
 */

class NestedIterator(nestedList: List<NestedInteger>, private val flattened: Iterator<Int> = mutableListOf<Int>().apply { DeepRecursiveFunction<List<NestedInteger>, Unit> { list -> list.forEach { if (it.isInteger()) add(it.getInteger()!!) else callRecursive(it.getList()!!) } }.invoke(nestedList) }.iterator()) { fun next(): Int = flattened.next() fun hasNext(): Boolean = flattened.hasNext() }