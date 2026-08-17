/*
 * @lc app=leetcode id=3250 lang=java
 *
 * [3250] Find the Count of Monotonic Pairs I
 */
class Solution { fun countOfPairs(A: IntArray): Int = A.indices.fold(IntArray(1001) { if (it <= A[0]) 1 else 0 }) { dp, i -> if (i == 0) dp else IntArray(1001).let { new -> maxOf(0, A[i] - A[i - 1]).let { d -> (0..1000).fold(0L) { s, j -> (if (j - d >= 0) (s + dp[j - d]) % 1000000007 else s).also { if (j <= A[i]) new[j] = it.toInt() } }.run { new } } } }.fold(0L) { s, v -> (s + v) % 1000000007 }.toInt() }