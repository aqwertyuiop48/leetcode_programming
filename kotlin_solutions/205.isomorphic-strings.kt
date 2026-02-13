/*
 * @lc app=leetcode id=205 lang=kotlin
 *
 * [205] Isomorphic Strings
 */

class Solution {fun isIsomorphic(s: String, t: String): Boolean =(s.indices.all { i ->s.indexOf(s[i]) == t.indexOf(t[i])} && s.toSet().size == t.toSet().size)}
