/*
 * @lc app=leetcode id=691 lang=kotlin
 *
 * [691] Stickers to Spell Word
 */

class Solution { fun minStickers(stickers: Array<String>, target: String): Int = stickers.map { s -> IntArray(26).apply { s.forEach { this[it - 'a']++ } } }.let { counts -> mutableMapOf<String, Int>().let { memo -> DeepRecursiveFunction<String, Int> { remaining -> remaining.ifEmpty { return@DeepRecursiveFunction 0 } .run{memo[remaining] ?: counts.mapNotNull { cnt -> remaining.fold(cnt.clone() to StringBuilder()) { (c, sb), ch -> if (c[ch - 'a'] > 0) c.apply { this[ch - 'a']-- } to sb else c to sb.append(ch) }.second.toString().takeIf { it.length < remaining.length }?.let { 1 + callRecursive(it) } }.minOrNull()?.also { memo[remaining] = it } ?: Int.MAX_VALUE / 2 }}(target).let { if (it >= Int.MAX_VALUE / 2) -1 else it } } } }

