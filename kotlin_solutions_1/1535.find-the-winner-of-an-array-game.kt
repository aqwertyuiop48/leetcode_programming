/*
 * @lc app=leetcode id=1535 lang=kotlin
 *
 * [1535] Find the Winner of an Array Game
 */

class Solution { fun getWinner(arr: IntArray, k: Int): Int = arr.drop(1).fold(arr[0] to 0) { (cur, win), x -> if (win >= k) cur to win else if (x > cur) x to 1 else cur to win + 1 }.first }