/*
 * @lc app=leetcode id=97 lang=kotlin
 *
 * [97] Interleaving String
 */

class Solution {fun isInterleave(s1: String, s2: String, s3: String): Boolean = (s1.length + s2.length == s3.length).takeIf { it }?.let { (object { fun check(i1: Int, i2: Int, i3: Int): Boolean = (i3 < 0 && i1 == -1 && i2 == -1) || (s3.getOrNull(i3) == s1.getOrNull(i1) && check(i1 - 1, i2, i3 - 1)) || (s3.getOrNull(i3) == s2.getOrNull(i2) && check(i1, i2 - 1, i3 - 1)) }).check(s1.lastIndex, s2.lastIndex, s3.lastIndex) } ?: false}

