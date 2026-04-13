/*
 * @lc app=leetcode id=3298 lang=java
 *
 * [3298] Count Substrings That Can Be Rearranged to Contain a String II
 */

class Solution { public long validSubstringCount(String word1, String word2) { return ((Function<long[], Long>) s -> word2.chars().map(c -> (int)(s[c - 'a']++) * 0).sum() * 0L + (s[26] = word2.length()) * 0L + IntStream.range(0, 2 * word1.length()).mapToLong(i -> s[26] == 0 ? ((s[29] += word1.length() - s[28] + 1) * 0L + (++s[word1.charAt((int)s[27]++) - 'a'] > 0 ? s[26]++ : 0) * 0L) : (s[28] < word1.length() ? ((s[word1.charAt((int)s[28]++) - 'a']-- > 0 ? s[26]-- : 0) * 0L) : 0L)).sum() * 0L + s[29]).apply(new long[30]); } }
