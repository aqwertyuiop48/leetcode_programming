/*
 * @lc app=leetcode id=6 lang=kotlin
 *
 * [6] Zigzag Conversion
 */

// @lc code=start
class Solution { fun convert(s: String, numRows: Int): String = if (numRows == 1) s else s.withIndex().groupBy { (i, _) -> (i % (2 * numRows - 2)).let { if (it < numRows) it else 2 * numRows - 2 - it } }.toSortedMap().values.joinToString("") { it.map { (_, c) -> c }.joinToString("") } }
// @lc code=end

