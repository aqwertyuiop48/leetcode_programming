/*
 * @lc app=leetcode id=672 lang=kotlin
 *
 * [672] Bulb Switcher II
 */

class Solution { fun flipLights(n: Int, presses: Int): Int = when { presses == 0 ->{ 1} n == 1 ->{ 2} n == 2 && presses == 1 ->{ 3} n == 2 ->{ 4} presses == 1 ->{ 4} presses == 2 ->{ 7} else ->{ 8} } }