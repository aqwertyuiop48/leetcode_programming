/*
 * @lc app=leetcode id=3248 lang=java
 *
 * [3248] Snake in Matrix
 */
class Solution { fun finalPositionOfSnake(n: Int, commands: List<String>): Int = commands.fold(0) { p, c -> p + if (c == "UP") -n else if (c == "DOWN") n else if (c == "LEFT") -1 else 1 } }