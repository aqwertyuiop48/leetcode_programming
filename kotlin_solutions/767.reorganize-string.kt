/*
 * @lc app=leetcode id=767 lang=kotlin
 *
 * [767] Reorganize String
 */

class Solution {fun reorganizeString(s: String) = s.groupingBy { it }.eachCount().let { freq -> if (freq.values.maxOrNull()!! > (s.length + 1) / 2) "" else java.util.PriorityQueue<Pair<Char, Int>>(compareByDescending { it.second }).apply { addAll(freq.map { it.key to it.value }) }.let { pq -> java.util.LinkedList<Pair<Char, Int>>().let { waitingQ -> buildString { while (pq.isNotEmpty()) pq.poll().also { (ch, cnt) -> append(ch).also { waitingQ.add(ch to cnt - 1).also { if (waitingQ.size == 2) waitingQ.poll().also { (c, n) -> if (n > 0) pq.offer(c to n) else Unit } } } } } } } } }