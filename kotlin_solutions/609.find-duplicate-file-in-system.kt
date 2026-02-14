/*
 * @lc app=leetcode id=609 lang=kotlin
 *
 * [609] Find Duplicate File in System
 */

class Solution { fun findDuplicate(paths: Array<String>): List<List<String>> = paths.flatMap { path -> path.split(" ").let { parts -> parts.drop(1).map { file -> file.substringBefore("(") to "${parts[0]}/${file.substringBefore("(")}" to file.substringAfter("(").dropLast(1) } } }.groupBy { it.second }.filter { it.value.size > 1 }.map { it.value.map { p -> p.first.second } } }