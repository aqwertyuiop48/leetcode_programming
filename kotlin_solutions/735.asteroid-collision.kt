/*
 * @lc app=leetcode id=735 lang=kotlin
 *
 * [735] Asteroid Collision
 */

class Solution {fun asteroidCollision(asteroids: IntArray) = asteroids.fold(mutableListOf<Int>()) { stack, ast -> if (ast > 0) stack.apply { add(ast) } else generateSequence { stack.lastOrNull()?.takeIf { it > 0 && it < -ast }?.let { stack.removeAt(stack.lastIndex) } }.count().let { stack.apply { if (lastOrNull()?.let { it > 0 && it == -ast } == true) removeAt(lastIndex) else if (lastOrNull()?.let { it < 0 } != false) add(ast) } } }.toIntArray()}