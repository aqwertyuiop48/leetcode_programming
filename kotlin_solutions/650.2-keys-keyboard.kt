/*
 * @lc app=leetcode id=650 lang=kotlin
 *
 * [650] 2 Keys Keyboard
 */

class Solution {fun minSteps(n: Int): Int = (2..n).fold(n to 0) { (curr, steps), d -> if (curr % d == 0) generateSequence(curr to steps) { (c, s) -> if (c % d == 0) (c / d to s + d) else null }.last() else curr to steps }.second}

