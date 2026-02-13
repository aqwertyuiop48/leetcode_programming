/*
 * @lc app=leetcode id=225 lang=kotlin
 *
 * [225] Implement Stack using Queues
 */

class MyStack(private val q: ArrayDeque<Int> = ArrayDeque()) { fun push(x: Int) = q.add(x).also { (1 until q.size).forEach { q.add(q.removeFirst()) } } fun pop(): Int = q.removeFirst() fun top(): Int = q.first() fun empty(): Boolean = q.isEmpty() }