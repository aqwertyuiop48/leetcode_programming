/*
 * @lc app=leetcode id=2582 lang=kotlin
 *
 * [2582] Pass the Pillow
 */

class Solution {fun passThePillow(n: Int, time: Int): Int {return if(time/(n-1)%2 == 0) 1+time%(n-1) else n-time%(n-1)}}
