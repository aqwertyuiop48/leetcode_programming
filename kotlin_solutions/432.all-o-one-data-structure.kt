/*
 * @lc app=leetcode id=432 lang=kotlin
 *
 * [432] All O`one Data Structure
 */

class AllOne(val map: MutableMap<String, Int> = mutableMapOf()) { fun inc(key: String) = map.put(key, map.getOrDefault(key, 0) + 1) fun dec(key: String) = map[key]?.minus(1)?.let { if (it == 0) map.remove(key) else map.put(key, it) } fun getMaxKey(): String = map.maxByOrNull { it.value }?.key ?: "" fun getMinKey(): String = map.minByOrNull { it.value }?.key ?: "" }