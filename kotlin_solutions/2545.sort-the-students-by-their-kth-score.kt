/*
 * @lc app=leetcode id=2545 lang=kotlin
 *
 * [2545] Sort the Students by Their Kth Score
 */

class Solution {fun sortTheStudents(score: Array<IntArray>, k: Int) = score.sortedByDescending { it[k] }.toTypedArray()}

