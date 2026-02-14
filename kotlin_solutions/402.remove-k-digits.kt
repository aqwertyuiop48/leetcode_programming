/*
 * @lc app=leetcode id=402 lang=kotlin
 *
 * [402] Remove K Digits
 */

class Solution { fun removeKdigits(num: String, k: Int): String = num.fold(StringBuilder() to k) { (sb, left), c -> (0 until left).asSequence().takeWhile { sb.isNotEmpty() && sb.last() > c }.onEach { sb.deleteCharAt(sb.lastIndex) }.count().let { removed -> sb.append(c) to (left - removed) } }.first.also { repeat((it.length - (num.length - k)).coerceAtLeast(0)) { _ -> it.deleteCharAt(it.lastIndex) } }.toString().dropWhile { it == '0' }.ifEmpty { "0" } }
