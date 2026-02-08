/*
 * @lc app=leetcode id=7 lang=kotlin
 *
 * [7] Reverse Integer
 */

// @lc code=start
class Solution { fun reverse(x: Int): Int = x.toString().removePrefix("-").reversed().toLongOrNull()?.let { (if (x < 0) -it else it).takeIf { n -> n in Int.MIN_VALUE..Int.MAX_VALUE }?.toInt() } ?: 0 }
// @lc code=end

