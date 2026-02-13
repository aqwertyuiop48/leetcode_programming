/*
 * @lc app=leetcode id=388 lang=kotlin
 *
 * [388] Longest Absolute File Path
 */

class Solution {fun lengthLongestPath(input: String): Int = input.split("\n").fold(mutableListOf<Int>() to 0) { (stack, maxLen), line -> line.takeWhile { it == '\t' }.length.let { level -> line.drop(level).let { name -> stack.apply { while (size > level) removeLast() }.let { s -> if (name.contains('.')) s to maxOf(maxLen, s.sum() + name.length + s.size) else s.apply { add(name.length) } to maxLen } } } }.second}