/*
 * @lc app=leetcode id=803 lang=kotlin
 *
 * [803] Bricks Falling When Hit
 */

class Solution { fun Array<IntArray>.at(i: Int, j: Int) = if (i < 0) 1 else if (i >= size || j < 0 || j >= first().size) 0 else this[i][j] fun hitBricks(grid: Array<IntArray>, hits: Array<IntArray>): IntArray = grid.size.let { n -> grid.first().size.let { m -> Array(n) { grid[it].copyOf() }.let { o -> hits.onEach { grid[it[0]][it[1]] = 0 }.run { DeepRecursiveFunction<Pair<Int, Int>, Int> { (i, j) -> if (i !in 0..<n || j !in 0..<m || grid[i][j] != 1) 0 else grid[i][j].let { prev -> 2.also { grid[i][j] = it }.let { 1 + callRecursive(i + 1 to j) + callRecursive(i - 1 to j) + callRecursive(i to j + 1) + callRecursive(i to j - 1) } }}.let { f -> (0..<m).onEach { f(0 to it) }.run { hits.reversed().map { (x, y) -> if (o[x][y] == 1) if (x == 0 || grid.at(x + 1, y) == 2 || grid.at(x - 1, y) == 2 || grid.at(x, y + 1) == 2 || grid.at(x, y - 1) == 2) {2.also { grid[x][y] = it }.run { listOf(x + 1 to y, x - 1 to y, x to y + 1, x to y - 1).filter { (i, j) -> grid.at(i, j) == 1 }.sumOf { f(it) } }} else 1.also { grid[x][y] = it }.run { 0 } else 0 }.reversed().toIntArray() } } } }}} }