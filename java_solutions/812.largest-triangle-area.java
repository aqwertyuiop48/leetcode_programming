/*
 * @lc app=leetcode id=812 lang=java
 *
 * [812] Largest Triangle Area
 */

class Solution {
    public double largestTriangleArea(int[][] p) {
        return IntStream.range(0, p.length).boxed().flatMap(i -> IntStream.range(i + 1, p.length).boxed().flatMap(j -> IntStream.range(j + 1, p.length).mapToObj(k -> 0.5 * Math.abs(p[i][0] * (p[j][1] - p[k][1]) + p[j][0] * (p[k][1] - p[i][1]) + p[k][0] * (p[i][1] - p[j][1]))))).mapToDouble(Double::doubleValue).max().orElse(0.0);
    }
}
