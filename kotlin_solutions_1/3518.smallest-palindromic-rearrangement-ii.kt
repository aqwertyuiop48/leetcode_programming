/*
 * @lc app=leetcode id=3518 lang=kotlin
 *
 * [3518] Smallest Palindromic Rearrangement II
 */

class Solution { fun smallestPalindrome(inputStr: String, K: Int): String = IntArray(26) { i -> inputStr.count { it == 'a' + i } / 2 }.let { cnt -> if (cnt.fold(1L to cnt.sum()) { (acc, n), c -> (1..c).fold(acc) { a, i -> minOf(1000001L, a * (n - i + 1) / i) } to (n - c) }.first < K) "" else (1..(inputStr.length / 2)).fold(Triple("", K.toLong(), cnt)) { (half, k, cArr), _ -> (0..25).fold(Triple(cArr, k, ' ')) { (arr, curK, chosen), c -> if (chosen != ' ' || arr[c] == 0) Triple(arr, curK, chosen) else arr.also { it[c]-- }.let { arr.fold(1L to arr.sum()) { (acc, n), cntC -> (1..cntC).fold(acc) { a, i -> minOf(1000001L, a * (n - i + 1) / i) } to (n - cntC) }.first.let { p -> if (curK <= p) Triple(arr, curK, 'a' + c) else arr.also { it[c]++ }.let { Triple(arr, curK - p, ' ') } } } }.let { (arr, curK, ch) -> Triple(half + ch, curK, arr) } }.first.let { half -> half + ('a'..'z').firstOrNull { c -> inputStr.count { it == c } % 2 != 0 }?.toString().orEmpty() + half.reversed() } } }