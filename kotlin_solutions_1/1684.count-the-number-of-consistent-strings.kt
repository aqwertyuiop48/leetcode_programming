/* @lc app=leetcode id=1684 lang=kotlin */
class Solution {
    fun countConsistentStrings(allowed: String, words: Array<String>): Int = allowed.toSet().let { s -> words.count { it.all { c -> c in s } } }
}