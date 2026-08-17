/* @lc app=leetcode id=960 lang=kotlin */

class Solution { fun minDeletionSize(strs: Array<String>): Int = strs[0].length.let { n -> IntArray(n) { 1 }.apply { indices.forEach { i -> this[i] = (0 until i).filter { j -> strs.all { it[j] <= it[i] } }.map { this[j] + 1 }.maxOrNull() ?: 1 } }.let { n - (it.maxOrNull() ?: 0) } } }