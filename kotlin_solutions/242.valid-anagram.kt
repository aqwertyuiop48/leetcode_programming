/*
 * @lc app=leetcode id=242 lang=kotlin
 *
 * [242] Valid Anagram
 */

class Solution { fun isAnagram(s: String, t: String): Boolean = s.length == t.length && s.chars().sorted().toArray() .contentEquals(t.chars().sorted().toArray()) }
