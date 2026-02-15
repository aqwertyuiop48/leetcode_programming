/*
 * @lc app=leetcode id=864 lang=kotlin
 *
 * [864] Shortest Path to Get All Keys
 */

class Solution { fun shortestPathAllKeys(grid: Array<String>) = grid.flatMapIndexed { r, row -> row.mapIndexed { c, ch -> ch.takeIf { it == '@' }?.run { r to c } } }.filterNotNull().first().let { startPos -> ((1 shl grid.sumOf { it.count { c -> c in 'a'..'f' } }) - 1).let { allKeys -> java.util.LinkedList<Triple<Int, Int, Int>>().apply { add(Triple(startPos.first, startPos.second, 0)) }.let { queue -> mutableSetOf(Triple(startPos.first, startPos.second, 0)).let { visited -> generateSequence(0) { it + 1 }.firstNotNullOfOrNull { steps -> queue.size.let { size -> (0 until size).firstNotNullOfOrNull { queue.poll().let { (r, c, keys) -> if (keys == allKeys) steps else { listOf(-1 to 0, 1 to 0, 0 to -1, 0 to 1).forEach { (dr, dc) -> (r + dr to c + dc).takeIf { (nr, nc) -> nr in grid.indices && nc in grid[0].indices }?.let { (nr, nc) -> grid[nr][nc].let { ch -> when { ch == '#' -> {null} ch in 'A'..'F' && keys and (1 shl (ch - 'A')) == 0 -> {null} ch in 'a'..'f' -> {Triple(nr, nc, keys or (1 shl (ch - 'a')))} else -> Triple(nr, nc, keys) }?.takeIf { visited.add(it) }?.also { queue.add(it) } } } } .run{null} } } } ?: if (queue.isEmpty()) -1 else null } } ?: -1 } } } } }

