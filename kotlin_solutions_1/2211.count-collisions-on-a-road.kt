/* @lc app=leetcode id=2211 lang=kotlin */
class Solution { fun countCollisions(directions: String): Int = directions.dropWhile { it == 'L' }.dropLastWhile { it == 'R' }.count { it != 'S' } }