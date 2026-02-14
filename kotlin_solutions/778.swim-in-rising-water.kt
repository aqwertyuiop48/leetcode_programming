/*
 * @lc app=leetcode id=778 lang=kotlin
 *
 * [778] Swim in Rising Water
 */

class Solution { fun swimInWater(grid: Array<IntArray>): Int = DeepRecursiveFunction<Int, Int> { time -> PriorityQueue<Triple<Int, Int, Int>>(compareBy { it.third }).apply { add(Triple(0, 0, grid[0][0])) }.let { queue -> mutableSetOf<Pair<Int, Int>>().apply { add(0 to 0) }.let { visited -> generateSequence { queue.takeIf { it.isNotEmpty() && it.peek().third <= time }?.poll()?.let { (i, j, _) -> (i to j).takeIf { it == grid.lastIndex to grid.lastIndex } ?: run { listOf(i + 1 to j, i - 1 to j, i to j + 1, i to j - 1).forEach { (ni, nj) -> ni.takeIf { it in grid.indices }?.let { _ -> nj.takeIf { it in grid[ni].indices }?.let { _ -> (ni to nj).takeUnless { it in visited }?.let { _ -> visited.add(ni to nj) .also{queue.add(Triple(ni, nj, grid[ni][nj]))} } } } } .also{(i to j)} } } }.firstOrNull { it == grid.lastIndex to grid.lastIndex }?.let { time } ?: callRecursive(time + 1) } } }(0) }