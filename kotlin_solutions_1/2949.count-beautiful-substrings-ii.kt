/*
 * @lc app=leetcode id=2949 lang=kotlin
 *
 * [2949] Count Beautiful Substrings II
 */

class Solution {
    fun beautifulSubstrings(s: String, k: Int): Long = (1..2 * k).first { x -> (x * x) % (4 * k) == 0 }.let { l -> HashMap<Pair<Int, Int>, Long>().also { map -> map[(l - 1) % l to 0] = 1L }.let { map -> s.indices.fold(0L to 0) { (ans, diff), i -> (diff + if (s[i] in "aeiou") 1 else -1).let { d -> (i % l to d).let { key -> (ans + map.getOrDefault(key, 0L)) to d.also { map[key] = map.getOrDefault(key, 0L) + 1L } } } }.first } }
}