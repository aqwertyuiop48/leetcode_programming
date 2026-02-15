/*
 * @lc app=leetcode id=3006 lang=kotlin
 *
 * [3006] Find Beautiful Indices in the Given Array I
 */

class Solution {fun beautifulIndices(s: String, a: String, b: String, k: Int) = (0..s.length - a.length).filter { i -> s.substring(i, i + a.length) == a }.let { aid -> (0..s.length - b.length).filter { i -> s.substring(i, i + b.length) == b }.let { bid -> aid.filter { aIdx -> bid.any { bIdx -> Math.abs(aIdx - bIdx) <= k } } } }}

