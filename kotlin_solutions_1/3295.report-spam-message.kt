/*
 * @lc app=leetcode id=3295 lang=java
 *
 * [3295] Report Spam Message
 */

fun reportSpam(message: Array<String>, bannedWords: Array<String>): Boolean = bannedWords.toHashSet().let { set -> message.count { set.contains(it) } >= 2 }