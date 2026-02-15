/*
 * @lc app=leetcode id=890 lang=kotlin
 *
 * [890] Find and Replace Pattern
 */

class Solution { fun findAndReplacePattern(words: Array<String>, pattern: String) = words.filter { word -> word.zip(pattern).fold(mutableMapOf<Char, Char>() to mutableMapOf<Char, Char>() to true) { (maps, valid), (w, p) -> if (!valid) maps to false else when { w in maps.first && maps.first[w] != p ->{ maps to false} p in maps.second && maps.second[p] != w ->{ maps to false} else -> (maps.first.apply { this[w] = p } to maps.second.apply { this[p] = w }) to true } }.second }.toTypedArray() }

