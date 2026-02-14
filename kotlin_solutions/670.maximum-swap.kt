/*
 * @lc app=leetcode id=670 lang=kotlin
 *
 * [670] Maximum Swap
 */

class Solution { fun maximumSwap(num: Int): Int = num.toString().toCharArray().let { arr -> IntArray(10) { -1 }.apply { arr.indices.forEach { i -> this[arr[i] - '0'] = i } }.let { last -> arr.indices.firstOrNull { i -> (9 downTo arr[i] - '0' + 1).any { last[it] > i } }?.let { i -> (9 downTo arr[i] - '0' + 1).first { last[it] > i }.let { digit -> arr[i] = ('0' + digit).also { arr[last[digit]] = arr[i] } } } .run{arr.concatToString().toInt()} } } }
