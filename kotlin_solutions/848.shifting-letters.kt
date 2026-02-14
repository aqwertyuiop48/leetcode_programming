/*
 * @lc app=leetcode id=848 lang=kotlin
 *
 * [848] Shifting Letters
 */

class Solution { fun shiftingLetters(str: String, shifts: IntArray): String = str.toCharArray().let { chars -> chars.indices.reversed().fold(0) { c, i -> (c + shifts[i]).let { newC -> (newC % 26).also { finalC -> chars[i] = ((chars[i] - 'a' + finalC) % 26 + 'a'.code).toChar() } } }.let { String(chars) } } }