/*
 * @lc app=leetcode id=1614 lang=kotlin
 *
 * [1614] Maximum Nesting Depth of the Parentheses
 */

class Solution {
    fun maxDepth(s: String): Int = s.fold(0 to 0) { (cur, maxD), c -> if (c == '(') cur + 1 to maxOf(maxD, cur + 1) else if (c == ')') cur - 1 to maxD else cur to maxD }.second
}