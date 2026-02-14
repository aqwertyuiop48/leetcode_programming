/*
 * @lc app=leetcode id=838 lang=kotlin
 *
 * [838] Push Dominoes
 */

class Solution { fun pushDominoes(dominoes: String): String = dominoes.length.let { len -> IntArray(len).let { arr -> CharArray(len).let { rez -> (if (dominoes[0] == 'R') 1 else if (dominoes[0] == 'L') -1 else 0).let { arr[0] = it }.let { _ -> (1 until len).fold(arr) { a, i -> a.also { when { dominoes[i] == 'R' -> {it[i] = 1} dominoes[i] == 'L' -> {it[i] = -1} else -> it[i] = if (it[i - 1] > 0) it[i - 1] + 1 else 0 } } }.let { a -> (if (a[len - 1] > 0) 'R' else if (a[len - 1] < 0) 'L' else '.').let { rez[len - 1] = it }.let { _ -> (len - 2 downTo 0).fold(a) { acc, i -> acc.also { if (it[i + 1] < 0) { when { it[i] == 0 -> {it[i] = it[i + 1]} it[i] > 0 -> {(it[i + 1] - 1).let { tmp -> when { it[i] + tmp == 0 -> {it[i] = 0} it[i] + tmp > 0 -> it[i] = tmp } }} } } }.also { rez[i] = if (it[i] > 0) 'R' else if (it[i] < 0) 'L' else '.' } }.let { _ -> String(rez) } } } } } } } }