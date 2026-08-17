/*
 * @lc app=leetcode id=1381 lang=kotlin
 *
 * [1381] Design a Stack With Increment Operation
 */

class CustomStack(val maxSize: Int, val stack: IntArray = IntArray(maxSize), val inc: IntArray = IntArray(maxSize), var top: Int = 0) { fun push(x: Int) = run { if (top < maxSize) stack[top++] = x } fun pop(): Int = if (top == 0) -1 else (--top).let { i -> (stack[i] + inc[i]).also { if (i > 0) inc[i - 1] += inc[i] }.also { inc[i] = 0 } } fun increment(k: Int, `val`: Int) = run { if (top > 0) inc[minOf(k, top) - 1] += `val` } }