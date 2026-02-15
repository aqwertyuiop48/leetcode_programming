/*
 * @lc app=leetcode id=1389 lang=kotlin
 *
 * [1389] Create Target Array in the Given Order
 */

class Solution {fun createTargetArray(n: IntArray, i: IntArray) = n.indices.fold(mutableListOf<Int>()) { l, idx -> l.add(i[idx], n[idx]).let { l } }.toIntArray()}
