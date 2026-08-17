/*
 * @lc app=leetcode id=1268 lang=kotlin
 *
 * [1268] Search Suggestions System
 */

class Solution {
    fun suggestedProducts(products: Array<String>, searchWord: String): List<List<String>> = products.sorted().let { sorted -> searchWord.indices.map { i -> searchWord.substring(0, i + 1).let { prefix -> sorted.filter { it.startsWith(prefix) }.take(3) } } }
}