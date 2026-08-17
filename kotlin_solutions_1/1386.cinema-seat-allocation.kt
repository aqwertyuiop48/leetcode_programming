/*
 * @lc app=leetcode id=1386 lang=kotlin
 *
 * [1386] Cinema Seat Allocation
 */

class Solution {
    fun maxNumberOfFamilies(n: Int, reservedSeats: Array<IntArray>): Int = reservedSeats.groupBy { it[0] }.values.sumOf { seats -> seats.map { it[1] }.toSet().let { s -> if ((2..9).none { it in s }) 2 else if ((2..5).none { it in s } || (6..9).none { it in s } || (4..7).none { it in s }) 1 else 0 } } + (n - reservedSeats.map { it[0] }.distinct().size) * 2
}