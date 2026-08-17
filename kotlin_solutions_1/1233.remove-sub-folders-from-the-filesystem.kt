/*
 * @lc app=leetcode id=1233 lang=kotlin
 *
 * [1233] Remove Sub-Folders from the Filesystem
 */
class Solution { fun removeSubfolders(folder: Array<String>): List<String> = folder.sorted().fold(mutableListOf<String>()) { acc, f -> acc.apply { if (isEmpty() || !f.startsWith("${last()}/")) add(f) } } }