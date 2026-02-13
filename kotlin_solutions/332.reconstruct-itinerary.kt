/*
 * @lc app=leetcode id=332 lang=kotlin
 *
 * [332] Reconstruct Itinerary
 */

class Solution {fun findItinerary(tickets: List<List<String>>) = tickets.groupBy { it[0] }.mapValues { (_, v) -> v.map { it[1] }.sorted().toMutableList() }.toMutableMap().let { graph -> mutableListOf<String>().also { result -> DeepRecursiveFunction<String, Unit> { airport -> generateSequence { graph[airport]?.takeIf { it.isNotEmpty() }?.removeAt(0) }.forEach { callRecursive(it) }.run { result.add(0, airport) } }.invoke("JFK") } }}