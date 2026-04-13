/*
 * @lc app=leetcode id=2643 lang=java
 *
 * [2643] Row With Maximum Ones
 */

class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        return IntStream.range(0, mat.length)
            .mapToObj(i -> new int[]{i, (int) IntStream.of(mat[i]).filter(v -> v == 1).count()})
            .reduce((a, b) -> b[1] > a[1] ? b : a)
            .orElse(new int[]{0, 0});
    }
}
