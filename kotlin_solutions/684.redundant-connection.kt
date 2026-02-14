/*
 * @lc app=leetcode id=684 lang=kotlin
 *
 * [684] Redundant Connection
 */

class Solution { fun findRedundantConnection(edges: Array<IntArray>) = IntArray(edges.size + 1) { it }.let { p -> edges.first { (u, v) -> (generateSequence(u) { p[it] }.first { p[it] == it } to generateSequence(v) { p[it] }.first { p[it] == it }).let { (ru, rv) -> (ru == rv).apply { if (!this) p[ru] = rv } } } } }
