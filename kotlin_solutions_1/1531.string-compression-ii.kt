/*
 * @lc app=leetcode id=1531 lang=kotlin
 *
 * [1531] String Compression II
 */

class Solution { fun getLengthOfOptimalCompression(s: String, k: Int): Int = Array(101) { IntArray(101) { -1 } }.let { memo -> DeepRecursiveFunction<Pair<Int, Int>, Int> { (i, k) -> if (k < 0) 1000 else if (i >= s.length || s.length - i <= k) 0 else if (memo[i][k] != -1) memo[i][k] else minOf(callRecursive(i + 1 to k - 1), (i until s.length).fold(Triple(0, 0, 1000)) { (same, diff, res), j -> if (diff > k) Triple(same, diff, res) else (if (s[j] == s[i]) same + 1 else same).let { ns -> (if (s[j] != s[i]) diff + 1 else diff).let { nd -> Triple(ns, nd, if (nd <= k) minOf(res, (if (ns == 1) 1 else if (ns < 10) 2 else if (ns < 100) 3 else 4) + callRecursive(j + 1 to k - nd)) else res) } } }.third).also { memo[i][k] = it } }(0 to k) } }