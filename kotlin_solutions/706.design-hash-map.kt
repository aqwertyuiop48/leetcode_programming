/*
 * @lc app=leetcode id=706 lang=kotlin
 *
 * [706] Design HashMap
 */

class MyHashMap(private val buckets: Array<MutableList<Pair<Int, Int>>> = Array(1000) { mutableListOf() }) { fun put(key: Int, value: Int) = buckets[key % 1000].apply { indexOfFirst { it.first == key }.let { idx -> if (idx >= 0) this[idx] = key to value else add(key to value) } }.let { } fun get(key: Int): Int = buckets[key % 1000].firstOrNull { it.first == key }?.second ?: -1 fun remove(key: Int) = buckets[key % 1000].removeIf { it.first == key }.let { } }
