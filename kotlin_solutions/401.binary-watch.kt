/*
 * @lc app=leetcode id=401 lang=kotlin
 *
 * [401] Binary Watch
 */

class Solution {fun readBinaryWatch(turnedOn: Int): List<String> = (0..11).flatMap { h -> (0..59).mapNotNull { m -> if (h.countOneBits() + m.countOneBits() == turnedOn) "$h:${m.toString().padStart(2, '0')}" else null } }}
