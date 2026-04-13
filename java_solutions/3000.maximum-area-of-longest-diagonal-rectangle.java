/*
 * @lc app=leetcode id=3000 lang=java
 *
 * [3000] Maximum Area of Longest Diagonal Rectangle
 */

class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        return Arrays.stream(dimensions)
            .max(Comparator.<int[]>comparingInt(d -> d[0] * d[0] + d[1] * d[1])
                .thenComparingInt(d -> d[0] * d[1]))
            .map(d -> d[0] * d[1])
            .orElse(0);
    }
}
