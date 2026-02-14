/*
 * @lc app=leetcode id=682 lang=kotlin
 *
 * [682] Baseball Game
 */

class Solution { fun calPoints(operations: Array<String>): Int = operations.fold(mutableListOf<Int>()) { stack, op -> stack.apply { when(op) { "+" -> add(takeLast(2).sum()) "D" -> add(last() * 2) "C" -> removeLastOrNull() else -> add(op.toInt()) } } }.sum() }

