/* @lc app=leetcode id=3091 lang=kotlin */
class Solution { fun minOperations(k: Int): Int = (1..k).minOf { v -> (v - 1) + (k - 1) / v } }