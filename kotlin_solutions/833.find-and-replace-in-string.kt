/*
 * @lc app=leetcode id=833 lang=kotlin
 *
 * [833] Find And Replace in String
 */

class Solution { fun findReplaceString(s: String, indices: IntArray, sources: Array<String>, targets: Array<String>): String = indices.indices.filter { s.startsWith(sources[it], indices[it]) } .associateBy({ indices[it] }, { it }) .let { map -> generateSequence(0 to StringBuilder()) { (j, sb) -> if (j < s.length) { map[j]?.let { idx -> (j + sources[idx].length) to sb.append(targets[idx]) } ?: (j + 1 to sb.append(s[j])) } else null }.last().second.toString() } }
