/*
 * @lc app=leetcode id=93 lang=kotlin
 *
 * [93] Restore IP Addresses
 */
class Solution { fun restoreIpAddresses(s: String): List<String> = (1..3).flatMap { a -> (1..3).flatMap { b -> (1..3).flatMap { c -> (1..3).mapNotNull { d -> if (a + b + c + d == s.length && listOf( s.substring(0, a), s.substring(a, a + b), s.substring(a + b, a + b + c), s.substring(a + b + c) ).all { it.toIntOrNull()?.let { num -> num in 0..255 } == true && (it.length == 1 || it[0] != '0') } ) "${s.substring(0, a)}.${s.substring(a, a + b)}.${s.substring(a + b, a + b + c)}.${s.substring(a + b + c)}" else null } } } } }