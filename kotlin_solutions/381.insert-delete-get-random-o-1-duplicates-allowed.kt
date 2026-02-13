/*
 * @lc app=leetcode id=381 lang=kotlin
 *
 * [381] Insert Delete GetRandom O(1) - Duplicates allowed
 */

class RandomizedCollection(private val list: MutableList<Int> = mutableListOf(), val insert: (Int) -> Boolean = { v -> !list.contains(v).apply { list.add(v) } }, val remove: (Int) -> Boolean = { list.remove(it) }, val getRandom: () -> Int = { list.random() })