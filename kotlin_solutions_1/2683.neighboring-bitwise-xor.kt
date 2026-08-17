/* @lc app=leetcode id=2683 lang=kotlin */
class Solution { fun doesValidArrayExist(derived: IntArray) = derived.fold(0) { a, b -> a xor b } == 0 }