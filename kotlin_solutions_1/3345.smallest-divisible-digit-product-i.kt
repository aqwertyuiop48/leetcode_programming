/*
 * @lc app=leetcode id=3345 lang=java
 *
 * [3345] Smallest Divisible Digit Product I
 */
class Solution {
    fun smallestNumber(n: Int, t: Int): Int = generateSequence(n) { it + 1 }.first { num -> num.toString().fold(1) { acc, c -> acc * (c - '0') } % t == 0 }
}