/*
 * @lc app=leetcode id=808 lang=java
 *
 * [808] Soup Servings
 */

class Solution {
    public double soupServings(int n) {
        return n >= 4800 ? 1.0 : java.util.stream.IntStream.of((n + 24) / 25).mapToDouble(m -> new double[m + 1][m + 1] instanceof double[][] g
            && java.util.stream.IntStream.rangeClosed(0, m).peek(i -> java.util.stream.IntStream.rangeClosed(0, m)
                .forEach(j -> g[i][j] = i == 0 ? (j == 0 ? 0.5 : 1) : j == 0 ? 0
                    : 0.25 * (g[Math.max(i - 4, 0)][j] + g[Math.max(i - 3, 0)][Math.max(j - 1, 0)] + g[Math.max(i - 2, 0)][Math.max(j - 2, 0)] + g[i - 1][Math.max(j - 3, 0)]))).allMatch(x -> true)
            ? g[m][m] : 0).findFirst().getAsDouble();
    }
}
