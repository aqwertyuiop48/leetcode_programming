/*
 * @lc app=leetcode id=743 lang=kotlin
 *
 * [743] Network Delay Time
 */

class Solution { fun networkDelayTime(times: Array<IntArray>, n: Int, k: Int): Int = IntArray(n + 1) { Int.MAX_VALUE }.apply { this[k] = 0 }.let { dist -> mutableMapOf<Int, MutableList<Pair<Int, Int>>>().apply { times.forEach { (u, v, w) -> getOrPut(u) { mutableListOf() }.add(v to w) } }.let { graph -> java.util.PriorityQueue<Pair<Int, Int>>(compareBy { it.second }).apply { add(k to 0) }.let { pq -> generateSequence { pq.poll() }.forEach { (node, d) -> if (d <= dist[node]) graph[node]?.forEach { (next, weight) -> (d + weight).let { newDist -> if (newDist < dist[next]) dist[next] = newDist.also { pq.offer(next to newDist) } } } } } } .run{dist.drop(1).maxOrNull()!!.let { if (it == Int.MAX_VALUE) -1 else it }} } }
