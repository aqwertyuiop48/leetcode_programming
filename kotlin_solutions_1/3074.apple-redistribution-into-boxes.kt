/*
 * @lc app=leetcode id=3074 lang=kotlin
 *
 * [3074] Apple Redistribution into Boxes
 */

class Solution { fun minimumBoxes(apple: IntArray, capacity: IntArray): Int = apple.sum().let { total -> capacity.sortedDescending().fold(total to 0) { (rem, count), cap -> if (rem <= 0) rem to count else (rem - cap) to (count + 1) }.second } }