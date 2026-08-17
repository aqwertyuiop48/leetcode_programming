/*
 * @lc app=leetcode id=3403 lang=java
 *
 * [3403] Find the Lexicographically Largest String From the Box I
 */

fun answerString(word: String, numFriends: Int): String = if (numFriends == 1) word else word.indices.map { i -> word.substring(i, minOf(i + word.length - numFriends + 1, word.length)) }.maxOrNull() ?: ""