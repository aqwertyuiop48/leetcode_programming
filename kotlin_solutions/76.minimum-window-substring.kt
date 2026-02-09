/*
 * @lc app=leetcode id=76 lang=kotlin
 *
 * [76] Minimum Window Substring
 */

class Solution { fun minWindow(s: String, t: String): String = t.groupingBy { it }.eachCount().let { need -> s.indices.fold(mutableMapOf<Char, Int>() to 0 to "") { (mapLeft, result), right -> mapLeft.first.apply { put(s[right], getOrDefault(s[right], 0) + 1) }.let { map -> generateSequence(mapLeft.second) { l -> (l < right && need.all { (c, cnt) -> map.getOrDefault(c, 0) >= cnt } && map.getOrDefault(s[l], 0) > need.getOrDefault(s[l], 0)).takeIf { it } ?.also { map[s[l]] = map[s[l]]!! - 1 }?.let { l + 1 } }.last().let { newLeft -> (map to newLeft) to (need.all { (c, cnt) -> map.getOrDefault(c, 0) >= cnt }) .let { if (it) s.substring(newLeft, right + 1) else "" } .let { if (it.isNotEmpty() && (result.isEmpty() || it.length < result.length)) it else result } } } }.second } }

