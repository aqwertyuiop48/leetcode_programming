/*
 * @lc app=leetcode id=461 lang=kotlin
 *
 * [461] Hamming Distance
 */

class Solution { fun hammingDistance(x: Int, y: Int): Int = (x xor y).countOneBits() }