/*
 * @lc app=leetcode id=3307 lang=java
 *
 * [3307] Find the K-th Character in String Game II
 */

fun kthCharacter(k: Long, operations: IntArray): Char = ('a'.toInt() + (0 until 62).filter { (k - 1) and (1L shl it) != 0L && it < operations.size }.sumOf { operations[it].toLong() }.toInt() % 26).toChar()