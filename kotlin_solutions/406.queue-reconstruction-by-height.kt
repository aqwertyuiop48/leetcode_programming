/*
 * @lc app=leetcode id=406 lang=kotlin
 *
 * [406] Queue Reconstruction by Height
 */

class Solution{fun reconstructQueue(people: Array<IntArray>): Array<IntArray> = people.sortedWith(compareBy<IntArray> { -it[0] }.thenBy { it[1] }).fold(mutableListOf<IntArray>()) { list, p -> list.apply { add(p[1], p) } }.toTypedArray()}