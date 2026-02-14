/*
 * @lc app=leetcode id=460 lang=kotlin
 *
 * [460] LFU Cache
 */

class LFUCache( val capacity: Int, val cache: MutableMap<Int, Pair<Int, Int>> = mutableMapOf(), val freq: MutableMap<Int, MutableSet<Int>> = mutableMapOf(), val keyFreq: MutableMap<Int, Int> = mutableMapOf(), var minFreq: Int = 0 ) { fun get(key: Int): Int = cache[key]?.let { (value, _) -> keyFreq[key]?.let { f -> freq[f]?.remove(key).also { if (freq[f]?.isEmpty() == true && f == minFreq) minFreq++ }.run { keyFreq[key] = f + 1 }.run { freq.getOrPut(f + 1) { mutableSetOf() }.add(key) } }.let { value } } ?: -1 fun put(key: Int, value: Int): Unit = if (capacity <= 0) Unit else cache[key]?.let { keyFreq[key]?.let { f -> freq[f]?.remove(key).also { if (freq[f]?.isEmpty() == true && f == minFreq) minFreq++ }.run { keyFreq[key] = f + 1 }.run { freq.getOrPut(f + 1) { mutableSetOf() }.add(key) } }.run { cache[key] = value to (keyFreq[key] ?: 1) } } ?: (if (cache.size >= capacity) freq[minFreq]?.first()?.let { cache.remove(it).run { keyFreq.remove(it) }.run { freq[minFreq]?.remove(it) } } else null).let { cache[key] = value to 1.also { minFreq = it }.also { keyFreq[key] = it }.also { freq.getOrPut(it) { mutableSetOf() }.add(key) } } }
