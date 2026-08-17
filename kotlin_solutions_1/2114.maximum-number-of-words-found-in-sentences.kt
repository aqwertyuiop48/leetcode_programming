/* @lc app=leetcode id=2114 lang=kotlin */
class Solution {
    fun mostWordsFound(sentences: Array<String>): Int = sentences.maxOf { it.split(" ").size }
}