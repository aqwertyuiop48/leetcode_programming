/*
 * @lc app=leetcode id=900 lang=kotlin
 *
 * [900] RLE Iterator
 */

class RLEIterator(encoding: IntArray, private val encodingArr: IntArray = encoding.copyOf(), private var cursor: Int = 0) {fun next(n: Int): Int = generateSequence(n) { remaining -> (cursor < encodingArr.size).takeIf { it }?.let { if (encodingArr[cursor] >= remaining) null.also { encodingArr[cursor] -= remaining } else (remaining - encodingArr[cursor]).also { cursor += 2 } } }.last().let { if (cursor < encodingArr.size) encodingArr[cursor + 1] else -1 }}