/*
 * @lc app=leetcode id=705 lang=kotlin
 *
 * [705] Design HashSet
 */

class MyHashSet(private val buckets: Array<MutableList<Int>> = Array(1000) { mutableListOf<Int>() }) { fun add(key: Int) = buckets[key % 1000].apply { if (key !in this) add(key) }.let { } fun remove(key: Int) = buckets[key % 1000].remove(key).let { } fun contains(key: Int): Boolean = key in buckets[key % 1000] }