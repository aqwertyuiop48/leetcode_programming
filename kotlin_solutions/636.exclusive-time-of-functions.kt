/*
 * @lc app=leetcode id=636 lang=kotlin
 *
 * [636] Exclusive Time of Functions
 */

class Solution { fun exclusiveTime(n: Int, logs: List<String>): IntArray = logs.fold(IntArray(n) to ArrayDeque<Pair<Int, Int>>() to 0) { (timeStack, prev), log -> log.split(":").let { (id, type, t) -> timeStack.first.also { if (type == "start") timeStack.second.firstOrNull()?.let { (fid, _) -> it[fid] += t.toInt() - prev } else it[id.toInt()] += t.toInt() - prev + 1 } to (if (type == "start") timeStack.second.apply { addFirst(id.toInt() to t.toInt()) } else timeStack.second.apply { removeFirst() }) to (if (type == "start") t.toInt() else t.toInt() + 1) } }.first.first }

