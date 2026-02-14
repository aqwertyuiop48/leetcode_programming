/*
 * @lc app=leetcode id=832 lang=kotlin
 *
 * [832] Flipping an Image
 */

class Solution { fun flipAndInvertImage(image: Array<IntArray>): Array<IntArray> = image.apply { forEach { row -> row.reverse().also{row.indices.forEach { row[it] = 1 - row[it] }} } } }
