/*
 * @lc app=leetcode id=68 lang=kotlin
 *
 * [68] Text Justification
 */

class Solution { fun fullJustify(words: Array<String>, maxWidth: Int): List<String> = words.fold(mutableListOf<MutableList<String>>()) { lines, word -> if (lines.isEmpty() || lines.last().sumOf { it.length } + lines.last().size + word.length > maxWidth) lines.apply { add(mutableListOf(word)) } else lines.apply { last().add(word) } }.let { allLines -> allLines.mapIndexed { idx, lineWords -> (lineWords.sumOf { it.length } to (maxWidth - lineWords.sumOf { it.length })).let { (totalChars, spaces) -> when { idx == allLines.lastIndex || lineWords.size == 1 -> lineWords.joinToString(" ") + " ".repeat(maxWidth - lineWords.sumOf { it.length } - lineWords.size + 1) else -> (spaces / (lineWords.size - 1) to spaces % (lineWords.size - 1)).let { (spaceBetween, extraSpaces) -> lineWords.mapIndexed { i, w -> if (i < lineWords.size - 1) w + " ".repeat(spaceBetween + if (i < extraSpaces) 1 else 0) else w }.joinToString("") } } } } } }

