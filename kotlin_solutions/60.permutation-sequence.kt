/*
 * @lc app=leetcode id=60 lang=kotlin
 *
 * [60] Permutation Sequence
 */

class Solution { fun getPermutation(n: Int, k: Int): String = IntArray(n + 1) { 1 }.also { arr -> (1..n).forEach { i -> arr[i] = arr[i - 1] * i } }.let { fact -> (object : Function5<Int, Int, BooleanArray, CharArray, Int, String> { override operator fun invoke(currentN: Int, currentK: Int, currentNums: BooleanArray, currentStr: CharArray, currentIndex: Int): String = if (currentN == 1) (0 until currentNums.size).first { !currentNums[it] }.let { idx -> currentStr.also { it[currentIndex] = (idx + 1).digitToChar() }.let { String(it) } } else if (currentK == 0) currentStr.also { str -> (0 until currentNums.size).filterNot { currentNums[it] }.fold(currentIndex) { idx, numVal -> str.also { it[idx] = (numVal + 1).digitToChar() }.let { idx + 1 } } }.let { String(it) } else fact[currentN - 1].let { divisor -> (currentK / divisor).let { divResult -> (currentK % divisor).let { modResult -> (0 until currentNums.size).filterNot { currentNums[it] }.drop(divResult).first().let { chosenNumValueIndex -> currentNums.also { it[chosenNumValueIndex] = true }.let { currentStr.also { it[currentIndex] = (chosenNumValueIndex + 1).digitToChar() } }.let { this(currentN - 1, modResult, currentNums, currentStr, currentIndex + 1) } } } } } }).run { BooleanArray(n) { false }.let { initialNums -> CharArray(n).let { initialCharArr -> this(n, k - 1, initialNums, initialCharArr, 0) } } } }}

