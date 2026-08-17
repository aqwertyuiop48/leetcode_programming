/* @lc app=leetcode id=1963 lang=kotlin */
class Solution { fun minSwaps(s: String): Int = s.fold(0) { bal, c -> if (c == '[') bal + 1 else if (bal > 0) bal - 1 else bal }.let { (it + 1) / 2 } }