/*
 * @lc app=leetcode id=3031 lang=kotlin
 *
 * [3031] Minimum Time to Revert Word to Initial State II
 */

class Solution { fun minimumTimeToInitialState(s: String, k: Int): Int = IntArray(s.length).also { pi -> (1 until s.length).fold(0) { j0, i -> generateSequence(j0) { j -> pi[j - 1] }.first { j -> j == 0 || s[i] == s[j] }.let { j -> (if (s[i] == s[j]) j + 1 else j).also { pi[i] = it } } } }.let { pi -> generateSequence(pi[s.length - 1]) { x -> if (x > 0) pi[x - 1] else null }.firstOrNull { x -> (s.length - x) % k == 0 } ?: 0 }.let { x -> (s.length - x + k - 1) / k } }