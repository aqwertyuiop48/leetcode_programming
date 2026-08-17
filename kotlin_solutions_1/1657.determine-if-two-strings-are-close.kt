/*
 * @lc app=leetcode id=1657 lang=kotlin
 *
 * [1657] Determine if Two Strings Are Close
 */

class Solution { fun closeStrings(w1: String, w2: String): Boolean = w1.length == w2.length && w1.toSet() == w2.toSet() && w1.groupingBy { it }.eachCount().values.sorted() == w2.groupingBy { it }.eachCount().values.sorted() }