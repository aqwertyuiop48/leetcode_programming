/*
 * @lc app=leetcode id=1422 lang=kotlin
 *
 * [1422] Maximum Score After Splitting a String
 */

class Solution { fun maxScore(s: String): Int = (1 until s.length).maxOf { i -> s.substring(0, i).count { it == '0' } + s.substring(i).count { it == '1' } } }