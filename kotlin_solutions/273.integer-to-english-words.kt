/*
 * @lc app=leetcode id=273 lang=kotlin
 *
 * [273] Integer to English Words
 */

class Solution {companion object{ private val units = arrayOf("", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine")}fun numberToWords(num: Int) = if (num == 0) "Zero" else listOf("Billion", "Million", "Thousand", "").withIndex().map { (idx, name) -> ((num / Math.pow(1000.0, 3 - idx.toDouble()).toInt()) % 1000).let { n -> if (n > 0) toHundred(n) + if (name.isNotEmpty()) " $name" else "" else "" } }.filter { it.isNotEmpty() }.joinToString(" ").trim() fun toHundred(num: Int) = listOfNotNull(if (num / 100 > 0) "${units[num / 100]} Hundred" else null, when { num % 100 >= 20 -> {"${arrayOf("", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety")[(num % 100) / 10]}${if (num % 10 > 0) " ${units[num % 10]}" else ""}"} num % 100 >= 10 -> {arrayOf("Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen")[num % 10]} num % 10 > 0 -> {units[num % 10]} else -> null }).joinToString(" ")}