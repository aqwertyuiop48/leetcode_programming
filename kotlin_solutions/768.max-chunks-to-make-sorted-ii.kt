/*
 * @lc app=leetcode id=768 lang=kotlin
 *
 * [768] Max Chunks To Make Sorted II
 */

class Solution{fun maxChunksToSorted(arr: IntArray) = arr.fold(mutableListOf<Int>()) { stack, num -> if (stack.isEmpty() || num >= stack.last()) stack.apply { add(num) } else stack.last().let { top -> stack.apply { while (isNotEmpty() && last() > num) removeLast() }.apply { add(top) } } }.size}
