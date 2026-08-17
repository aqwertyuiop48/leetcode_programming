/*
 * @lc app=leetcode id=1456 lang=kotlin
 *
 * [1456] Maximum Number of Vowels in a Substring of Given Length
 */

class Solution { fun maxVowels(s: String, k: Int): Int = s.indices.fold(0 to 0) { (cur, maxV), i -> (cur + (if (s[i] in "aeiou") 1 else 0) - (if (i >= k && s[i - k] in "aeiou") 1 else 0)).let { it to maxOf(maxV, it) } }.second }