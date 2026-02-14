/*
 * @lc app=leetcode id=831 lang=kotlin
 *
 * [831] Masking Personal Information
 */

class Solution { fun maskPII(s: String): String = if (s.contains("@")) { s.lowercase().split("@").let { (name, domain) -> "${name.first()}*****${name.last()}@$domain" } } else { s.filter { it.isDigit() }.let { digits -> "***-***-${digits.takeLast(4)}".let { local -> (digits.length - 10).let { cc -> if (cc == 0) local else "+${"*".repeat(cc)}-$local" } } } } }