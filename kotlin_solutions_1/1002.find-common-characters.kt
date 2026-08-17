/* @lc app=leetcode id=1002 lang=kotlin */
class Solution {
    fun commonChars(words: Array<String>): List<String> = words.map { word -> IntArray(26).apply { word.forEach { this[it - 'a']++ } } }.reduceOrNull { a, b -> IntArray(26) { minOf(a[it], b[it]) } }?.let { finalArr -> finalArr.indices.flatMap { i -> List(finalArr[i]) { ('a' + i).toString() } } } ?: emptyList()
}