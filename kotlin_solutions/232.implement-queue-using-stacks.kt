/*
 * @lc app=leetcode id=232 lang=kotlin
 *
 * [232] Implement Queue using Stacks
 */

class MyQueue(private val list: MutableList<Int> = mutableListOf()) { fun push(x: Int) { list.add(x) } fun pop() = list.removeFirst() fun peek() = list.first() fun empty() = list.isEmpty() }
