/*
 * @lc app=leetcode id=664 lang=kotlin
 *
 * [664] Strange Printer
 */

class Solution { fun strangePrinter(s: String): Int = with(Array(s.length) { IntArray(s.length) }) { s.mapIndexed { to, sto -> (to downTo 0).map { from -> when { to - from <= 1 -> {if (s[from] == sto) 1 else 2} s[from] == sto -> {this[from + 1][to]} else -> (from until to).map { this[from][it] + this[it + 1][to] }.min()!! }.also { this[from][to] = it } }.last()!! }.last()!! } }
