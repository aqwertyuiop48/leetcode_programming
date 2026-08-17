/*
 * @lc app=leetcode id=1734 lang=kotlin
 *
 * [1734] Decode XORed Permutation
 */
class Solution { fun decode(encoded: IntArray): IntArray = IntArray(encoded.size + 1).also { res -> res[0] = (1..res.size).reduce(Int::xor) xor (1 until encoded.size step 2).fold(0) { a, i -> a xor encoded[i] } }.also { res -> encoded.indices.forEach { res[it + 1] = res[it] xor encoded[it] } } }