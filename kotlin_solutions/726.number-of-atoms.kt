/*
 * @lc app=leetcode id=726 lang=kotlin
 *
 * [726] Number of Atoms
 */

class Solution { fun countOfAtoms(formula: String): String = Regex("""([A-Z][a-z]*)(\d*)|(\()|(\))(\d*)""").findAll(formula) .fold(mutableListOf(mutableMapOf<String, Int>())) { s, m -> m.groupValues.drop(1).let { (e, n, l, r, m) -> s.apply { if (e.isNotEmpty()) last()[e] = (last()[e] ?: 0) + (n.toIntOrNull() ?: 1) else if (l.isNotEmpty()) add(mutableMapOf()) else removeLast().forEach { (k, v) -> last()[k] = (last()[k] ?: 0) + v * (m.toIntOrNull() ?: 1) } } } }[0].toSortedMap().entries.joinToString("") { "${it.key}${it.value.takeIf { it > 1 } ?: ""}" } }