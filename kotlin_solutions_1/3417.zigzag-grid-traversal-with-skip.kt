/*
 * @lc app=leetcode id=3417 lang=java
 *
 * [3417] Zigzag Grid Traversal With Skip
 */

fun zigzagTraversal(grid: Array<IntArray>): List<Int> = grid.indices.flatMap { r -> if (r % 2 == 0) grid[r].indices.map { c -> r to c } else grid[r].indices.reversed().map { c -> r to c } }.filterIndexed { i, _ -> i % 2 == 0 }.map { (r, c) -> grid[r][c] }