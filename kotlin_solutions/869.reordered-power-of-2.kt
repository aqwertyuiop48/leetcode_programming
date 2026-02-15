/*
 * @lc app=leetcode id=869 lang=kotlin
 *
 * [869] Reordered Power of 2
 */

class Solution { fun reorderedPowerOf2(n: Int) = n.toString().toList().sorted().joinToString("").let { target -> generateSequence(1) { it shl 1 }.takeWhile { it <= 1000000000 }.any { it.toString().toList().sorted().joinToString("") == target } } }

