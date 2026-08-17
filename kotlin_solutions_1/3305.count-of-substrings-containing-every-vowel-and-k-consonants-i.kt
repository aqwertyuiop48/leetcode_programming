/*
 * @lc app=leetcode id=3305 lang=java
 *
 * [3305] Count of Substrings Containing Every Vowel and K Consonants I
 */
fun countOfSubstrings(word: String, k: Int): Int = { target: Int -> IntArray(128).let { cnt -> longArrayOf(0L, 0L, 0L, 0L).let { state -> word.indices.forEach { r -> word[r].let { char -> if ("aeiou".contains(char)) (if (cnt[char.code]++ == 0) state[2]++ else 0L) else state[1]++ }.let { generateSequence {}.takeWhile { state[2] == 5L && state[1] >= target }.forEach { _ -> state.apply { this[3] += (word.length - r).toLong() }.let { word[state[0].toInt()] }.let { leftChar -> if ("aeiou".contains(leftChar)) (if (--cnt[leftChar.code] == 0) state[2]-- else 0L) else state[1]-- }.let { state[0]++ } } } }.let { state[3] } } }.let { f -> (f(k) - f(k + 1)).toInt() }