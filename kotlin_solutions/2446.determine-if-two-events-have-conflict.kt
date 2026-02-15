/*
 * @lc app=leetcode id=2446 lang=kotlin
 *
 * [2446] Determine if Two Events Have Conflict
 */

class Solution {fun haveConflict(event1: Array<String>, event2: Array<String>): Boolean = event1[0].compareTo(event2[1]) <= 0 && event2[0].compareTo(event1[1]) <= 0}