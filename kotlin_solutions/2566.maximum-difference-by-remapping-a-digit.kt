/*
 * @lc app=leetcode id=2566 lang=kotlin
 *
 * [2566] Maximum Difference by Remapping a Digit
 */

class Solution {fun minMaxDifference(num: Int) = num.toString().let { s -> (s as java.lang.String).replaceAll((s as java.lang.String).replaceAll("9", "").let { if (it.isEmpty()) s.substring(0, 1) else it.substring(0, 1) }, "9").toInt() - (s as java.lang.String).replaceAll(s.substring(0, 1), "0").toInt() }}
