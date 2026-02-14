/*
 * @lc app=leetcode id=599 lang=kotlin
 *
 * [599] Minimum Index Sum of Two Lists
 */

class Solution { fun findRestaurant(list1: Array<String>, list2: Array<String>): Array<String> = list1.withIndex().associate { it.value to it.index }.let { m1 -> list2.withIndex().mapNotNull { (i2, s) -> m1[s]?.let { i1 -> s to (i1 + i2) } }.groupBy { it.second }.minByOrNull { it.key }?.value?.map { it.first }?.toTypedArray() ?: emptyArray() } }
