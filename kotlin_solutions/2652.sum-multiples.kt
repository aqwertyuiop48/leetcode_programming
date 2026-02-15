/*
 * @lc app=leetcode id=2652 lang=kotlin
 *
 * [2652] Sum Multiples
 */

class Solution {fun sumOfMultiples(n: Int) = (3..n).filter { it % 3 == 0 || it % 5 == 0 || it % 7 == 0 }.sum()}
