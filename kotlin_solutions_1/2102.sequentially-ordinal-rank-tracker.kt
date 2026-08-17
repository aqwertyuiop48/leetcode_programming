/* @lc app=leetcode id=2102 lang=kotlin */
class SORTracker(val topK: java.util.PriorityQueue<String> = java.util.PriorityQueue(java.util.Collections.reverseOrder()), val rest: java.util.PriorityQueue<String> = java.util.PriorityQueue()) {
fun add(name: String, score: Int) = topK.add((1000000 - score).toString().padStart(7, '0') + name).run { rest.add(topK.poll()) }
fun get(): String = rest.poll().let { topK.add(it).run { topK.peek().substring(7) } } }