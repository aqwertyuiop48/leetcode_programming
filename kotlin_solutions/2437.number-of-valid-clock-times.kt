/*
 * @lc app=leetcode id=2437 lang=kotlin
 *
 * [2437] Number of Valid Clock Times
 */

class Solution {fun countTime(time: String): Int =when {time[0] == '?' && time[1] == '?' -> {24}time[0] == '?' -> {if (time[1] < '4') 3 else 2}time[1] == '?' -> {if (time[0] < '2') 10 else 4}else -> 1}.let { hourCombinations ->when {time[3] == '?' && time[4] == '?' -> {hourCombinations * 6 * 10}time[3] == '?' -> {hourCombinations * 6}time[4] == '?' -> {hourCombinations * 10}else -> hourCombinations}}}
