/*
 * @lc app=leetcode id=2981 lang=kotlin
 *
 * [2981] Find Longest Special Substring That Occurs Thrice I
 */

class Solution { fun maximumLength(s: String): Int = HashMap<String, Int>().also { m -> s.indices.forEach { i -> (i until s.length).takeWhile { j -> s[j] == s[i] }.forEach { j -> s.substring(i, j + 1).let { sub -> m[sub] = (m[sub] ?: 0) + 1 } } } }.filter { it.value >= 3 }.keys.maxOfOrNull { it.length } ?: -1 }