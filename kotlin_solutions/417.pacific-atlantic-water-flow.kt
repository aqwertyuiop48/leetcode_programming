/*
 * @lc app=leetcode id=417 lang=kotlin
 *
 * [417] Pacific Atlantic Water Flow
 */

class Solution { fun pacificAtlantic(heights: Array<IntArray>): List<List<Int>> = listOf( heights.indices.flatMap { i -> listOf(i to 0) } + heights[0].indices.flatMap { j -> listOf(0 to j) }, heights.indices.flatMap { i -> listOf(i to heights[0].lastIndex) } + heights[0].indices.flatMap { j -> listOf(heights.lastIndex to j) } ).map { starts -> starts.toSet().let { vis -> generateSequence(vis to starts) { (v, q) -> q.flatMap { (r, c) -> listOf(-1 to 0, 1 to 0, 0 to -1, 0 to 1).mapNotNull { (dr, dc) -> (r + dr to c + dc).takeIf { (nr, nc) -> nr in heights.indices && nc in heights[0].indices && nr to nc !in v && heights[nr][nc] >= heights[r][c] } } }.toSet().let { nq -> if (nq.isEmpty()) null else v + nq to nq.toList() } }.last().first } }.let { (pac, atl) -> (pac intersect atl).map { listOf(it.first, it.second) } } }

