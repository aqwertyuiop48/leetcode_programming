/*
 * @lc app=leetcode id=146 lang=kotlin
 *
 * [146] LRU Cache
 */

class LRUCache(private val capacity: Int, private val cache: MutableMap<Int, Int> = mutableMapOf(), private val accessOrder: MutableMap<Int, Int> = mutableMapOf(), private val pq: PriorityQueue<Pair<Int, Int>> = PriorityQueue(compareBy { it.second }), private var timestamp: Int = 0) { fun get(key: Int) = cache[key]?.also { accessOrder[key] = ++timestamp }.also { pq.offer(key to timestamp) } ?: -1 fun put(key: Int, value: Int) = if (cache.containsKey(key)) cache.put(key, value).also { accessOrder[key] = ++timestamp }.also { pq.offer(key to timestamp) }.let { } else if (cache.size >= capacity) generateSequence { pq.poll() }.first { it?.first?.let { k -> accessOrder[k] == it.second } == true }.first.let { lruKey -> cache.remove(lruKey).also { accessOrder.remove(lruKey) } }.run { cache[key] = value }.also { accessOrder[key] = ++timestamp }.also { pq.offer(key to timestamp) }.let { } else cache.put(key, value).also { accessOrder[key] = ++timestamp }.also { pq.offer(key to timestamp) }.let { } }
