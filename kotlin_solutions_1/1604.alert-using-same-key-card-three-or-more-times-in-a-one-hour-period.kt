/*
 * @lc app=leetcode id=1604 lang=kotlin
 *
 * [1604] Alert Using Same Key-Card Three or More Times in a One Hour Period
 */

class Solution {
    fun alertNames(keyName: Array<String>, keyTime: Array<String>): List<String> = keyName.indices.groupBy { keyName[it] }.mapValues { (_, idxs) -> idxs.map { keyTime[it].substring(0, 2).toInt() * 60 + keyTime[it].substring(3).toInt() }.sorted() }.filter { (_, times) -> times.indices.drop(2).any { i -> times[i] - times[i - 2] <= 60 } }.keys.sorted()
}