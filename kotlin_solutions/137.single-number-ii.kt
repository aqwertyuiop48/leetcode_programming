/*
 * @lc app=leetcode id=137 lang=kotlin
 *
 * [137] Single Number II
 */

class Solution {fun singleNumber(nums: IntArray): Int =nums.fold(0 to 0) { (ones, twos), num -> ((ones xor num) and twos.inv()) to ((twos xor num) and (ones xor num).inv()) }.first}
