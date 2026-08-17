/*
 * @lc app=leetcode id=1606 lang=kotlin
 *
 * [1606] Find Servers That Handled Most Number of Requests
 */

class Solution {
    fun busiestServers(k: Int, arrival: IntArray, load: IntArray): List<Int> = IntArray(k).let { reqs -> java.util.TreeSet((0 until k).toList()).let { free -> java.util.PriorityQueue<IntArray>(compareBy { it[0] }).let { busy -> arrival.indices.forEach { i -> generateSequence { busy.peek()?.takeIf { it[0] <= arrival[i] } }.forEach { free.add(busy.poll()[1]) }.also { (free.ceiling(i % k) ?: free.firstOrNull())?.let { target -> free.remove(target).also { busy.offer(intArrayOf(arrival[i] + load[i], target)) }.also { reqs[target]++ } } } }.run { reqs.maxOrNull().let { max -> reqs.indices.filter { reqs[it] == max } } } } } }
}