/*
 * @lc app=leetcode id=3005 lang=kotlin
 *
 * [3005] Count Elements With Maximum Frequency
 */

import java.util.Collections class Solution { fun maxFrequencyElements(nums: IntArray) = nums.toList().let { list -> list.map { Collections.frequency(list, it) }.let { freq -> Collections.frequency(freq, Collections.max(freq)) } }}

