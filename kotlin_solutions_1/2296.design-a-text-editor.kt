/* @lc app=leetcode id=2296 lang=kotlin */
class TextEditor(val l: StringBuilder = StringBuilder(), val r: StringBuilder = StringBuilder()) {
fun addText(t: String) = l.append(t).let { }
fun deleteText(k: Int) = minOf(k, l.length).also { repeat(it) { l.deleteCharAt(l.length - 1) } }
fun cursorLeft(k: Int) = repeat(minOf(k, l.length)) { r.append(l.last()).also { l.deleteCharAt(l.length - 1) } }.run { l.substring(maxOf(0, l.length - 10)) }
fun cursorRight(k: Int) = repeat(minOf(k, r.length)) { l.append(r.last()).also { r.deleteCharAt(r.length - 1) } }.run { l.substring(maxOf(0, l.length - 10)) } }