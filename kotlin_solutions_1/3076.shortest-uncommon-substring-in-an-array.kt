/*
 * @lc app=leetcode id=3076 lang=kotlin
 *
 * [3076] Shortest Uncommon Substring in an Array
 */

class Solution { fun shortestSubstrings(arr: Array<String>): Array<String> = arr.indices.map { i -> arr[i].let { s -> (1..s.length).flatMap { len -> (0..s.length - len).map { start -> s.substring(start, start + len) } }.filter { sub -> arr.indices.none { j -> j != i && arr[j].contains(sub) } }.minWithOrNull(compareBy({ it.length }, { it })) ?: "" } }.toTypedArray() }