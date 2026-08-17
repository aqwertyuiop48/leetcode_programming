/*
 * @lc app=leetcode id=3304 lang=java
 *
 * [3304] Find the K-th Character in String Game I
 */

fun kthCharacter(k: Int): Char = ('a'.toInt() + Integer.bitCount(k - 1) % 26).toChar()