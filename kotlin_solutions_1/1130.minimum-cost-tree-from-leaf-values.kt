/* @lc app=leetcode id=1130 lang=kotlin */

class Solution {
    fun mctFromLeafValues(arr: IntArray): Int = java.util.Stack<Int>().apply { push(Int.MAX_VALUE) }.let { stack -> intArrayOf(0).apply { arr.forEach { x -> this.apply { while (stack.peek() <= x) this[0] += stack.pop() * minOf(stack.peek(), x) }.apply { stack.push(x) } } }.apply { while (stack.size > 2) this[0] += stack.pop() * stack.peek() }[0] }
}