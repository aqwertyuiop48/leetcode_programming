/*
 * @lc app=leetcode id=260 lang=kotlin
 *
 * [260] Single Number III
 */

class Solution { fun singleNumber(nums: IntArray): IntArray = nums.reduce { acc, num -> acc xor num }.let { xor2no -> (xor2no and -xor2no).let { lowestBit -> intArrayOf( nums.filter { lowestBit and it == 0 }.fold(0) { acc, num -> acc xor num }, nums.filter { lowestBit and it != 0 }.fold(0) { acc, num -> acc xor num } ) } } }