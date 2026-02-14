/*
 * @lc app=leetcode id=556 lang=kotlin
 *
 * [556] Next Greater Element III
 */

class Solution {fun nextGreaterElement(n: Int) = n.toString().toCharArray().let { chars -> (chars.size - 2 downTo 0).firstOrNull { chars[it] < chars[it + 1] }?.let { i -> (chars.size - 1 downTo i + 1).first { chars[it] > chars[i] }.also { j -> chars[i] = chars[j].also { chars[j] = chars[i] } }.let { chars.apply { reverse(i + 1, size) } }.let { String(it).toLongOrNull()?.takeIf { it <= Int.MAX_VALUE }?.toInt() ?: -1 } } ?: -1 }}
