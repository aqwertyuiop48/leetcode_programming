/*
 * @lc app=leetcode id=2939 lang=kotlin
 *
 * [2939] Maximum Xor Product
 */

class Solution { fun maximumXorProduct(a: Long, b: Long, n: Int): Int = (n - 1 downTo 0).fold(a to b) { (currA, currB), i -> (1L shl i).let { mask -> if ((currA and mask) == (currB and mask)) (currA or mask) to (currB or mask) else if (currA > currB) (currA and mask.inv()) to (currB or mask) else (currA or mask) to (currB and mask.inv()) } }.let { (ansA, ansB) -> ((ansA % 1000000007) * (ansB % 1000000007) % 1000000007).toInt() } }