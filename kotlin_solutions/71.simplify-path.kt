/*
 * @lc app=leetcode id=71 lang=kotlin
 *
 * [71] Simplify Path
 */

class Solution {fun simplifyPath(path: String): String = path.split("/").filter { it.isNotEmpty() && it != "." }.fold(mutableListOf<String>()) { stack, dir -> if (dir == "..") stack.apply { if (isNotEmpty()) removeAt(lastIndex) } else stack.apply { add(dir) } }.let { "/" + it.joinToString("/") }}

