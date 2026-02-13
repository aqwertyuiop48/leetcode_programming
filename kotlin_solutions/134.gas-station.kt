/*
 * @lc app=leetcode id=134 lang=kotlin
 *
 * [134] Gas Station
 */

class Solution { fun canCompleteCircuit(gas: IntArray, cost: IntArray): Int = gas.indices.fold(Triple(0, 0, 0)) { (total, tank, start), i -> (tank + gas[i] - cost[i]).let { newTank -> Triple( total + gas[i] - cost[i], if (newTank < 0) 0 else newTank, if (newTank < 0) i + 1 else start ) } }.let { (total, _, start) -> if (total >= 0) start else -1 } }

