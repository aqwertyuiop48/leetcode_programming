/*
 * @lc app=leetcode id=3265 lang=java
 *
 * [3265] Count Almost Equal Pairs I
 */
class Solution { fun countPairs(nums: IntArray): Int = nums.indices.sumOf { i -> (i + 1 until nums.size).count { j -> nums[i].toString().padStart(7, '0').let { s1 -> nums[j].toString().padStart(7, '0').let { s2 -> nums[i] == nums[j] || s1.indices.filter { s1[it] != s2[it] }.let { d -> d.size == 2 && s1[d[0]] == s2[d[1]] && s1[d[1]] == s2[d[0]] } } } } } }