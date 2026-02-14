/*
 * @lc app=leetcode id=811 lang=kotlin
 *
 * [811] Subdomain Visit Count
 */

class Solution { fun subdomainVisits(cpdomains: Array<String>): List<String> = mutableMapOf<String, Int>().apply { cpdomains.forEach { s -> s.split(" ").let { (cnt, dom) -> dom.split(".").indices.forEach { i -> dom.split(".").drop(i).joinToString(".").let { sub -> this[sub] = getOrDefault(sub, 0) + cnt.toInt() } } } } }.map { "${it.value} ${it.key}" } }