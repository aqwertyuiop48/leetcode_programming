/*
 * @lc app=leetcode id=3443 lang=java
 *
 * [3443] Maximum Manhattan Distance After K Changes
 */
class Solution { fun maxDistance(s: String, k: Int): Int = IntArray(10).let { v -> s.indices.forEach { i -> (if (s[i] == 'N') v[1]++ else if (s[i] == 'S') v[2]++ else if (s[i] == 'E') v[3]++ else v[4]++).run { (Math.min(v[1], v[2]) + Math.min(v[3], v[4])).let { m -> (v[1] + v[2] + v[3] + v[4] - 2 * Math.max(0, m - k)).let { dist -> if (dist > v[6]) v[6] = dist } } } }.run { v[6] } } }