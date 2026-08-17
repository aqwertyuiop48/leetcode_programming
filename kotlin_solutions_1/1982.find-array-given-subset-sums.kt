/*
 * @lc app=leetcode id=1982 lang=kotlin
 *
 * [1982] Find Array Given Subset Sums
 */

class Solution { fun recoverArray(n: Int, sums: IntArray): IntArray = (0 until n).fold(sums.sorted().toIntArray() to IntArray(n)) { (s, res), i -> (s[1] - s[0]).let { d -> BooleanArray(s.size).let { used -> IntArray(s.size / 2).let { s0 -> IntArray(s.size / 2).let { s1 -> s.indices.fold(Triple(0, 0, false)) { (k, p, zeroInS0), j -> if (used[j]) Triple(k, p, zeroInS0) else (k until s.size).first { !used[it] && s[it] == s[j] + d }.let { nextK -> used.set(nextK, true).run { s0.set(p, s[j]).run { s1.set(p, s[nextK]).run { Triple(nextK + 1, p + 1, zeroInS0 || s[j] == 0) } } } } }.let { (_, _, zeroInS0) -> if (zeroInS0) res.set(i, d).run { s0 to res } else res.set(i, -d).run { s1 to res } } } } } } }.second }