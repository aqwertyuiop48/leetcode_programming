/*
 * @lc app=leetcode id=839 lang=kotlin
 *
 * [839] Similar String Groups
 */

class Solution { fun numSimilarGroups(strs: Array<String>): Int = strs.size.let { size -> IntArray(size) { it }.let { id -> IntArray(size) { 0 }.let { rank -> object { fun find(x: Int): Int = if (id[x] == x) x else find(id[x]) fun union(x: Int, y: Int) = find(x).let { fx -> find(y).let { fy -> (fx == fy).takeIf { !it }?.let { when { rank[fx] < rank[fy] -> {id[fy] = fx} rank[fx] > rank[fy] -> {id[fx] = fy} else -> id[fx] = fy.also { rank[fy]++ } } } } } }.let { uf -> (0 until size).forEach { i -> (i + 1 until size).forEach { j -> (uf.find(i) == uf.find(j)).takeIf { !it }?.let { object { fun isSimliar(str1: String, str2: String): Boolean = (0 until str1.length).fold(mutableListOf<Int>()) { diff, i -> diff.also { if (str1[i] != str2[i]) { it.add(i) } } }.let { diff -> when { diff.size > 2 -> {false} diff.size == 0 -> {true} diff.size == 1 -> {false} else -> str1[diff[1]] == str2[diff[0]] && str1[diff[0]] == str2[diff[1]] } } }.isSimliar(strs[i], strs[j]).takeIf { it }?.let { uf.union(i, j) } } } }.let { _ -> (0 until size).fold(HashSet<Int>()) { set, i -> set.also { uf.find(i).let { key -> if (!it.contains(key)) it.add(key) } } }.size } } } } } }
