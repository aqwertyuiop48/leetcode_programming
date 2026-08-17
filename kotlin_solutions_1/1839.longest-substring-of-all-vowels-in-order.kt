/*
 * @lc app=leetcode id=1839 lang=kotlin
 *
 * [1839] Longest Substring Of All Vowels in Order
 */

class Solution { fun longestBeautifulSubstring(word: String): Int = (1 until word.length).fold(Triple(0, if (word[0] == 'a') 1 else 0, if (word[0] == 'a') 1 else 0)) { (maxLen, curLen, uniqueCount), i -> word[i - 1].let { prev -> word[i].let { curr -> when { curr > prev -> {if (curLen > 0) Triple(maxLen, curLen + 1, uniqueCount + 1) else if (curr == 'a') Triple(maxLen, 1, 1) else Triple(maxLen, 0, 0)} curr == prev -> {if (curLen > 0) Triple(maxLen, curLen + 1, uniqueCount) else Triple(maxLen, 0, 0)} else -> {if (curr == 'a') Triple(maxLen, 1, 1) else Triple(maxLen, 0, 0) }} } }.let { (mx, cl, uc) -> Triple(if (uc == 5) maxOf(mx, cl) else mx, cl, uc) } }.first }