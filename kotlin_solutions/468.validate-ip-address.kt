/*
 * @lc app=leetcode id=468 lang=kotlin
 *
 * [468] Validate IP Address
 */

class Solution { fun validIPAddress(queryIP: String): String = when { queryIP.count { it == '.' } == 3 -> {queryIP.split(".") .takeIf { it.size == 4 && it.all { p -> p.toIntOrNull()?.let { it in 0..255 && p == it.toString() } == true } } ?.let { "IPv4" }} queryIP.count { it == ':' } == 7 -> {queryIP.split(":") .takeIf { it.size == 8 && it.all { p -> p.length in 1..4 && p.all { c -> c in "0123456789abcdefABCDEF" } } } ?.let { "IPv6" }} else -> null } ?: "Neither" }