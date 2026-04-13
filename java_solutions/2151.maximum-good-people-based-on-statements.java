/*
 * @lc app=leetcode id=2151 lang=java
 *
 * [2151] Maximum Good People Based on Statements
 */

class Solution { public int maximumGood(int[][] A) { return IntStream.range(0, 1 << A.length).filter(mask -> IntStream.range(0, A.length).allMatch(i -> (mask & (1 << i)) == 0 || IntStream.range(0, A.length).allMatch(j -> A[i][j] == 2 || A[i][j] == ((mask >> j) & 1)))).map(mask -> Integer.bitCount(mask)).max().orElse(0); } }
