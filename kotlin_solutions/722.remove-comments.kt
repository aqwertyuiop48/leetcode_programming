/*
 * @lc app=leetcode id=722 lang=kotlin
 *
 * [722] Remove Comments
 */

class Solution { fun removeComments(source: Array<String>): List<String> = source.fold(Triple(mutableListOf(mutableListOf<Char>()), false, 0)) { (blocks, inComment, _), row -> row.foldIndexed(Triple(blocks, inComment, 0)) { j, (blks, inCmt, skip), char -> when { skip > 0 ->{ Triple(blks, inCmt, skip - 1)} !inCmt && j + 1 < row.length && row.substring(j, j + 2) == "/*" -> {Triple(blks, true, 1)} !inCmt && j + 1 < row.length && row.substring(j, j + 2) == "//" -> {Triple(blks, inCmt, row.length - j)} inCmt && j + 1 < row.length && row.substring(j, j + 2) == "*/" -> {Triple(blks, false, 1)} !inCmt -> {Triple(blks.apply { last().add(char) }, inCmt, 0)} else -> Triple(blks, inCmt, 0) } }.let { (blks, inCmt, _) -> Triple(blks.apply { if (!inCmt && last().isNotEmpty()) add(mutableListOf()) }, inCmt, 0) } }.first.filter { it.isNotEmpty() }.map { it.joinToString("") } }