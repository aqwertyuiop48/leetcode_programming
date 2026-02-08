/*
 * @lc app=leetcode id=13 lang=kotlin
 *
 * [13] Roman to Integer
 */

// @lc code=start
class Solution {fun romanToInt(s: String): Int = mapOf('I' to 1, 'V' to 5, 'X' to 10, 'L' to 50, 'C' to 100, 'D' to 500, 'M' to 1000).let { map -> s.foldIndexed(0) { i, sum, c -> sum + map[c]!! * if (i + 1 < s.length && map[c]!! < map[s[i + 1]]!!) -1 else 1 } }}
// @lc code=end

