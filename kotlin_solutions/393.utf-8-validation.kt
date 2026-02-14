/*
 * @lc app=leetcode id=393 lang=kotlin
 *
 * [393] UTF-8 Validation
 */

class Solution {fun validUtf8(data: IntArray): Boolean = data.fold(0) { remaining, byte -> when { remaining > 0 -> {if (byte shr 6 == 2) remaining - 1 else return false} byte shr 7 == 0 -> {0} byte shr 5 == 6 -> {1} byte shr 4 == 14 -> {2} byte shr 3 == 30 ->{3} else -> return false } } == 0}

