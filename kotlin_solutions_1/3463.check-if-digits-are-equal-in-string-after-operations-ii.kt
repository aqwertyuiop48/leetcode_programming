/*
 * @lc app=leetcode id=3463 lang=java
 *
 * [3463] Check If Digits Are Equal in String After Operations II
 */
class Solution { fun hasSameDigits(s: String): Boolean = arrayOf(intArrayOf(1,0,0,0,0, 1,1,0,0,0, 1,2,1,0,0, 1,3,3,1,0, 1,4,1,4,1), IntArray(3), intArrayOf(1, 5, 25, 125, 625, 3125, 15625, 78125)).let { st -> s.indices.forEach { i -> (if (((s.length - 1) and i) == i) (st[1] as IntArray).also { it[0] = (it[0] + s[i] - '0') % 2 } else 0).run { if (i <= s.length - 2) (0 until 8).fold(1) { res, step -> (res * (st[0] as IntArray)[((((s.length - 2) / (st[2] as IntArray)[step]) % 5) * 5) + ((i / (st[2] as IntArray)[step]) % 5)]) % 5 }.let { coeff -> (st[1] as IntArray).also { it[1] = (it[1] + coeff * (s[i] - '0')) % 5 }.also { it[2] = (it[2] + coeff * (s[i + 1] - '0')) % 5 } } } }.run { (st[1] as IntArray)[0] == 0 && (st[1] as IntArray)[1] == (st[1] as IntArray)[2] } } }