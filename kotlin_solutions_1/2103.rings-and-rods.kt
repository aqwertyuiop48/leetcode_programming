/* @lc app=leetcode id=2103 lang=kotlin */
class Solution { fun countPoints(rings: String): Int = rings.chunked(2).groupBy({ it[1] }, { it[0] }).values.count { it.distinct().size == 3 } }