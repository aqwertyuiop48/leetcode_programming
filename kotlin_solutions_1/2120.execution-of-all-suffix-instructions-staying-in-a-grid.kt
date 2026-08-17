/* @lc app=leetcode id=2120 lang=kotlin */
class Solution {
    fun executeInstructions(n: Int, startPos: IntArray, s: String): IntArray = IntArray(s.length) { i -> (i until s.length).asSequence().scan(Triple(startPos[0], startPos[1], true)) { acc, j -> if (!acc.third) acc else (acc.first + (if (s[j] == 'U') -1 else if (s[j] == 'D') 1 else 0)).let { nr -> (acc.second + (if (s[j] == 'L') -1 else if (s[j] == 'R') 1 else 0)).let { nc -> if (nr in 0 until n && nc in 0 until n) Triple(nr, nc, true) else Triple(nr, nc, false) } } }.count { it.third } - 1 }
}