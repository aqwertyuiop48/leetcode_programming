/*
 * @lc app=leetcode id=816 lang=kotlin
 *
 * [816] Ambiguous Coordinates
 */

class Solution {fun ambiguousCoordinates(s: String): List<String> = { n: String -> (1..n.length).mapNotNull { i -> n.substring(0, i).let { l -> n.substring(i).let { r -> when { l.length > 1 && l[0] == '0' || r.isNotEmpty() && r.last() == '0' -> {null} else -> if (r.isEmpty()) l else "$l.$r" } } } } }.let { v -> (2 until s.lastIndex).flatMap { bp -> v(s.substring(1, bp)).flatMap { x -> v(s.substring(bp, s.lastIndex)).map { y -> "($x, $y)" } } } }}

