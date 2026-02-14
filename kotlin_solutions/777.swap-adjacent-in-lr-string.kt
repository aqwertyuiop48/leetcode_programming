/*
 * @lc app=leetcode id=777 lang=kotlin
 *
 * [777] Swap Adjacent in LR String
 */

class Solution { fun canTransform(start: String, result: String): Boolean = (start.replace("X", "") == result.replace("X", "")).let { sameSeq -> sameSeq && start.indices.filter { start[it] == 'R' }.zip(result.indices.filter { result[it] == 'R' }).all { (i, j) -> i <= j } && start.indices.filter { start[it] == 'L' }.zip(result.indices.filter { result[it] == 'L' }).all { (i, j) -> i >= j } } }