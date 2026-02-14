/*
 * @lc app=leetcode id=847 lang=kotlin
 *
 * [847] Shortest Path Visiting All Nodes
 */

class Solution { fun shortestPathLength(graph: Array<IntArray>): Int = graph.size.let { nodesCount -> ((1 shl nodesCount) - 1).let { visitedAllNodesBitMask -> LinkedList<IntArray>().apply { (0 until nodesCount).forEach { nodeIndex -> add(intArrayOf(nodeIndex, 1 shl nodeIndex, 0)) } }.let { queuedMoves -> HashSet<Int>().let { cachedMoves -> generateSequence { queuedMoves.poll()?.takeIf { queuedMoves.isNotEmpty() || it != null } }.map { polledMove -> (polledMove[1] == visitedAllNodesBitMask).let { allNodesAreVisited -> if (allNodesAreVisited) polledMove[2] else graph[polledMove[0]].also { neighbours -> neighbours.forEach { neighbourNodeId -> (polledMove[1] or (1 shl neighbourNodeId)).let { newMask -> ((newMask shl 16) + neighbourNodeId).let { newMoveHashCode -> cachedMoves.add(newMoveHashCode).takeIf { it }?.let { queuedMoves.offer(intArrayOf(neighbourNodeId, newMask, polledMove[2] + 1)) } } } } }.let { null } } }.filterNotNull().firstOrNull() ?: -1 } } } } }