/*
 * @lc app=leetcode id=675 lang=kotlin
 *
 * [675] Cut Off Trees for Golf Event
 */

class Solution { fun cutOffTree(forest: List<List<Int>>): Int = forest.flatMapIndexed { r, row -> row.mapIndexed { c, h -> Triple(h, r, c) } }.filter { it.first > 1 }.sortedBy { it.first }.let { trees -> trees.fold(Triple(0, 0, 0)) { (sr, sc, steps), (_, tr, tc) -> (mutableSetOf(sr to sc) to mutableSetOf(sr to sc)).let { (queue, visited) -> generateSequence(queue to 0) { (q, d) -> q.flatMap { (r, c) -> listOf(r-1 to c, r+1 to c, r to c-1, r to c+1) } .filter { (r, c) -> r in forest.indices && c in forest[0].indices && forest[r][c] > 0 && visited.add(r to c) } .toMutableSet().takeIf { it.isNotEmpty() }?.let { it to d + 1 } }.firstOrNull { (tr to tc) in it.first }?.let { Triple(tr, tc, steps + it.second) } ?: return -1 } }.third } }
