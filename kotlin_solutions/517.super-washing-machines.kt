/*
 * @lc app=leetcode id=517 lang=kotlin
 *
 * [517] Super Washing Machines
 */

class Solution { fun findMinMoves(machines: IntArray) = machines.sum().let { sum -> machines.size.let { len -> (sum % len).takeIf { it > 0 }?.let { -1 } ?: (sum / len).let { avg -> machines.fold(0 to 0) { (ret, tmp), n -> (n - avg).let { diff -> (tmp + diff).let { newTmp -> maxOf(ret, abs(newTmp), diff) to newTmp } } }.first } } } }

