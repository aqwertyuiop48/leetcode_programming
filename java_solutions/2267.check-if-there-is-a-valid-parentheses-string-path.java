/*
 * @lc app=leetcode id=2267 lang=java
 *
 * [2267]  Check if There Is a Valid Parentheses String Path
 */

class Solution { public boolean hasValidPath(char[][] A) { return ((Function<boolean[][][], Boolean>) dp -> (dp[0][0][1] = true) ? IntStream.range(0, A.length).reduce(0, (acc, i) -> IntStream.range(0, A[0].length).reduce(0, (acc2, j) -> IntStream.rangeClosed(1, 101).reduce(0, (acc3, k) -> ((dp[i][j + 1][k] |= dp[i][j][k + (A[i][j] == '(' ? -1 : 1)]) ? 0 : 0) + ((dp[i + 1][j][k] |= dp[i][j][k + (A[i][j] == '(' ? -1 : 1)]) ? 0 : 0)) * 0) * 0) * 0 == 0 ? dp[A.length][A[0].length - 1][1] : false : false).apply(new boolean[A.length + 1][A[0].length + 1][103]); } }
