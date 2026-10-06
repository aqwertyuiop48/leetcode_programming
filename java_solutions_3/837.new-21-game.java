/*
 * @lc app=leetcode id=837 lang=java
 *
 * [837] New 21 Game
 */

class Solution {
    public double new21Game(int n, int k, int maxPts) {
        return k == 0 || n >= k + maxPts - 1 ? 1.0 : new double[n + 1] instanceof double[] dp && new double[]{1} instanceof double[] w && (dp[0] = 1) == 1
            && java.util.stream.IntStream.rangeClosed(1, n).peek(i -> {
                if ((dp[i] = w[0] / maxPts) >= 0 && (i < k ? (w[0] += dp[i]) >= 0 : true) && (i - maxPts >= 0 && i - maxPts < k ? (w[0] -= dp[i - maxPts]) >= -1 : true)) {}
            }).allMatch(x -> true)
            ? java.util.stream.IntStream.rangeClosed(k, n).mapToDouble(i -> dp[i]).sum() : 0;
    }
}
