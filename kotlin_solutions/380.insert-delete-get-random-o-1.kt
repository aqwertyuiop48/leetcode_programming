/*
 * @lc app=leetcode id=380 lang=kotlin
 *
 * [380] Insert Delete GetRandom O(1)
 */

class RandomizedSet(private val localSet: MutableSet<Int> = mutableSetOf()) { fun insert(`val`: Int): Boolean { return localSet.add(`val`) } fun remove(`val`: Int): Boolean { return localSet.remove(`val`) } fun getRandom(): Int { return localSet.elementAt((1..localSet.size).random() - 1) } }
