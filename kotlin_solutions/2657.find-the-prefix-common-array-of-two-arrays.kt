/*
 * @lc app=leetcode id=2657 lang=kotlin
 *
 * [2657] Find the Prefix Common Array of Two Arrays
 */

class Solution {fun findThePrefixCommonArray(A: IntArray, B: IntArray) = A.indices.map { i -> A.take(i + 1).toSet().intersect(B.take(i + 1).toSet()).size }.toIntArray()}
