/*
 * @lc app=leetcode id=3407 lang=java
 *
 * [3407] Substring Matching Pattern
 */

fun hasMatch(s: String, p: String): Boolean = p.indexOf('*').let { i -> s.indexOf(p.substring(0, i)).let { l -> l != -1 && s.substring(l + i).contains(p.substring(i + 1)) } }