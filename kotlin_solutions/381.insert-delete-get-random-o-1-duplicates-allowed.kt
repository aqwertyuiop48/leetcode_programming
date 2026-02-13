/*
 * @lc app=leetcode id=381 lang=kotlin
 *
 * [381] Insert Delete GetRandom O(1) - Duplicates allowed
 */

class RandomizedCollection(private val list: MutableList<Int> = mutableListOf()) { fun insert(`val`: Int) = list.contains(`val`).also { list.add(`val`) }.not() fun remove(`val`: Int) = list.remove(`val` as Int?) fun getRandom() = list.random() }