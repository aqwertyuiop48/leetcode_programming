/*
 * @lc app=leetcode id=133 lang=kotlin
 *
 * [133] Clone Graph
 */

class Solution { fun cloneGraph(node: Node?): Node? = node?.let { mutableMapOf<Node, Node>().let { map -> DeepRecursiveFunction<Node, Node> { original -> map.getOrPut(original) { Node(original.`val`) }.also { clone -> original.neighbors.forEach { neighbor -> neighbor?.let { n -> if (n !in map) callRecursive(n).also { clone.neighbors.add(map[n]!!) } else clone.neighbors.add(map[n]!!) } } } }.invoke(it) } } }

