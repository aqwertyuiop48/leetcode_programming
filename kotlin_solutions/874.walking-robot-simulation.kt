/*
 * @lc app=leetcode id=874 lang=kotlin
 *
 * [874] Walking Robot Simulation
 */

class Solution { fun robotSim(commands: IntArray, obstacles: Array<IntArray>) = obstacles.map { it[0] to it[1] }.toSet().let { obs -> commands.fold(Triple(0 to 0, 0, 0)) { (pos, dir, maxDist), cmd -> when (cmd) { -2 -> {Triple(pos, (dir + 3) % 4, maxDist)} -1 -> {Triple(pos, (dir + 1) % 4, maxDist)} else -> (1..cmd).fold(Triple(pos, dir, maxDist)) { (p, d, max), _ -> listOf(0 to 1, 1 to 0, 0 to -1, -1 to 0)[d].let { (dx, dy) -> (p.first + dx to p.second + dy).let { newPos -> if (newPos in obs) Triple(p, d, max) else Triple(newPos, d, maxOf(max, newPos.first * newPos.first + newPos.second * newPos.second)) } } } } }.third } }
