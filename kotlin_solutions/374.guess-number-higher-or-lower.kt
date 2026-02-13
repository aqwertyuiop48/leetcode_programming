/*
 * @lc app=leetcode id=374 lang=kotlin
 *
 * [374] Guess Number Higher or Lower
 */

class Solution:GuessGame() { override fun guessNumber(n:Int):Int { return bs(1, n) } tailrec fun bs(left: Int, right: Int): Int { return (left + (right - left) / 2).let { mid -> when { guess(mid) == 0 -> {mid} guess(mid) == 1 -> {bs(mid + 1, right)} else -> bs(left, mid - 1) } } } }
