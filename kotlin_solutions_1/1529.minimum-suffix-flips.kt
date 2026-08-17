/*
 * @lc app=leetcode id=1529 lang=kotlin
 *
 * [1529] Minimum Suffix Flips
 */

class Solution { fun minFlips(target: String): Int = target.fold('0' to 0) { (cur, count), c -> if (c != cur) c to count + 1 else cur to count }.second }