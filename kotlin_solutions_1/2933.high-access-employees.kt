/*
 * @lc app=leetcode id=2933 lang=kotlin
 *
 * [2933] High-Access Employees
 */

class Solution { fun findHighAccessEmployees(access_times: List<List<String>>): List<String> = access_times.groupBy({ it[0] }, { it[1].substring(0, 2).toInt() * 60 + it[1].substring(2).toInt() }).filter { (_, times) -> times.sorted().let { t -> (0..t.size - 3).any { i -> t[i + 2] - t[i] < 60 } } }.keys.toList() }