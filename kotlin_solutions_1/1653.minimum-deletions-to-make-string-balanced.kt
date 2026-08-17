/*
 * @lc app=leetcode id=1653 lang=kotlin
 *
 * [1653] Minimum Deletions to Make String Balanced
 */

class Solution { fun minimumDeletions(s: String): Int = s.fold(0 to 0) { (del, b), c -> if (c == 'b') del to b + 1 else minOf(del + 1, b) to b }.first }