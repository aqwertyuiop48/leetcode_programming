/*
 * @lc app=leetcode id=1835 lang=kotlin
 *
 * [1835] Find XOR Sum of All Pairs Bitwise AND
 */

class Solution { fun getXORSum(arr1: IntArray, arr2: IntArray): Int = arr1.fold(0, Int::xor) and arr2.fold(0, Int::xor) }