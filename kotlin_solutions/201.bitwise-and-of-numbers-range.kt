/*
 * @lc app=leetcode id=201 lang=kotlin
 *
 * [201] Bitwise AND of Numbers Range
 */

class Solution {fun rangeBitwiseAnd(left: Int, right: Int): Int =generateSequence(left to right) { (l, r) ->(l != r).takeIf { it }?.let { (l shr 1) to (r shr 1) }}.count { (l, r) -> l != r }.let { shifts ->(left shr shifts) shl shifts}}