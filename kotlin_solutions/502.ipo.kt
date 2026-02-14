/*
 * @lc app=leetcode id=502 lang=kotlin
 *
 * [502] IPO
 */

class Solution(var availableCapital: Int = 0, val maxHeap: PriorityQueue<Int> = PriorityQueue(compareByDescending { it }), var index: Int = 0) { data class Project(val capital: Int, val profit: Int) fun findMaximizedCapital(k: Int, w: Int, profits: IntArray, capital: IntArray) = w.also { availableCapital = it }.also { maxHeap.clear() }.also { index = 0 }.let { profits.indices.map { Project(capital[it], profits[it]) }.sortedBy { it.capital }.let { projects -> (0 until k).forEach { _ -> generateSequence { index.takeIf { it < projects.size && projects[it].capital <= availableCapital }?.also { maxHeap.add(projects[it].profit) }?.also { index++ } }.forEach { } .also{maxHeap.poll()?.let { availableCapital += it }} } }.run { availableCapital } } }