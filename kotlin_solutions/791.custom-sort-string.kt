/*
 * @lc app=leetcode id=791 lang=kotlin
 *
 * [791] Custom Sort String
 */

class Solution { fun customSortString(order: String, s: String): String = order.withIndex().associate { it.value to it.index }.let { orderMap -> s.toList().sortedWith(compareBy { orderMap.getOrElse(it) { order.length + s.indexOf(it) } }).joinToString("") } }