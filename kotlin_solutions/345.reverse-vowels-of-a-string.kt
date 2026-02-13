/*
 * @lc app=leetcode id=345 lang=kotlin
 *
 * [345] Reverse Vowels of a String
 */

class Solution {fun reverseVowels(s: String): String = s.toCharArray().also { arr -> intArrayOf(0, arr.size - 1).let { ptr -> generateSequence { ptr.takeIf { it[0] < it[1] } }.forEach { _ -> generateSequence { ptr[0].takeIf { ptr[0] < ptr[1] && arr[ptr[0]] !in "aeiouAEIOU" } }.forEach { _ -> ptr[0]++ }.run { generateSequence { ptr[1].takeIf { ptr[0] < ptr[1] && arr[ptr[1]] !in "aeiouAEIOU" } }.forEach { _ -> ptr[1]-- }.run { if (ptr[0] < ptr[1]) arr[ptr[0]] = arr[ptr[1]].also { arr[ptr[1]] = arr[ptr[0]] }.also { ptr[0]++ }.also { ptr[1]-- } else Unit } } } } }.concatToString()}