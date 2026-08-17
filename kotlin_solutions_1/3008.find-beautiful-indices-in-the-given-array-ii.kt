/*
 * @lc app=leetcode id=3008 lang=kotlin
 *
 * [3008] Find Beautiful Indices in the Given Array II
 */

class Solution { fun beautifulIndices(s: String, a: String, b: String, k: Int): List<Int> = { txt: String, pat: String -> (pat + "#" + txt).let { con -> IntArray(con.length).also { z -> arrayOf(0, 0).also { p -> (1 until con.length).forEach { i -> (if (i <= p[1]) z[i] = minOf(p[1] - i + 1, z[i - p[0]]) else 0).run { while (i + z[i] < con.length && con[z[i]] == con[i + z[i]]) z[i] = z[i] + 1 }.run { if (i + z[i] - 1 > p[1]) p.also { it[0] = i }.also { it[1] = i + z[i] - 1 } else null } } } }.let { z -> (pat.length + 1 until con.length).filter { z[it] >= pat.length }.map { it - pat.length - 1 }.toIntArray() } } }.let { getOccur -> getOccur(s, a).let { v1 -> getOccur(s, b).let { v2 -> v1.filter { i -> java.util.Arrays.binarySearch(v2, i).let { idx -> (idx >= 0) || (~idx < v2.size && v2[~idx] <= i + k) || (~idx > 0 && i - v2[~idx - 1] <= k) } } } } } }