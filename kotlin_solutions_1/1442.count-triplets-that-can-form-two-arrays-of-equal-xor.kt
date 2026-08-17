/*
 * @lc app=leetcode id=1442 lang=kotlin
 *
 * [1442] Count Triplets That Can Form Two Arrays of Equal XOR
 */

class Solution { fun countTriplets(arr: IntArray): Int = arr.indices.sumOf { i -> (i until arr.size).fold(0 to 0) { (ans, cur), k -> (cur xor arr[k]).let { nxt -> (if (k > i && nxt == 0) ans + k - i else ans) to nxt } }.first } }