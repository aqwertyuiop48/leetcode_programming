/*
 * @lc app=leetcode id=715 lang=kotlin
 *
 * [715] Range Module
 */

class RangeModule(var ranges: MutableList<Pair<Int, Int>> = mutableListOf()) { fun addRange(left: Int, right: Int) = mutableListOf<Pair<Int, Int>>().let { toAdd -> intArrayOf(left, right).let { bounds -> ranges.removeAll { (s, e) -> (e < bounds[0] || s > bounds[1]).also { keep -> if (keep) toAdd.add(s to e) else run { bounds[0] = minOf(bounds[0], s).also{bounds[1] = maxOf(bounds[1], e)} } } }.run { ranges.clear().run { ranges.addAll((toAdd + (bounds[0] to bounds[1])).sortedBy { it.first }) } } } } fun queryRange(left: Int, right: Int): Boolean = ranges.any { it.first <= left && it.second >= right } fun removeRange(left: Int, right: Int) = mutableListOf<Pair<Int, Int>>().let { toAdd -> ranges.removeAll { (s, e) -> (e <= left || s >= right).also { keep -> if (keep) toAdd.add(s to e) else listOfNotNull((s to left).takeIf { s < left }, (right to e).takeIf { e > right }).also { toAdd.addAll(it) } } }.run { ranges.clear().run { ranges.addAll(toAdd.sortedBy { it.first }) } } } }