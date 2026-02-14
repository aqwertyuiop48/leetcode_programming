/*
 * @lc app=leetcode id=455 lang=kotlin
 *
 * [455] Assign Cookies
 */

class Solution { fun findContentChildren(g: IntArray, s: IntArray) = g.apply { sort() }.run { s.apply { sort() }.fold(0) { i, c -> if (i < size && get(i) <= c) i + 1 else i } } }

