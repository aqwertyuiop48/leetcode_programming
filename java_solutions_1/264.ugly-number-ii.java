/*
 * @lc app=leetcode id=264 lang=java
 *
 * [264] Ugly Number II
 */

// @lc code=start
class Solution {
    public int nthUglyNumber(int n) {
        return java.util.stream.IntStream.range(1, n).boxed().reduce(java.util.stream.Stream.of(0).map(_v -> new int[][]{new int[n], {0, 0, 0}}).peek(a -> a[0][0] = 1).findFirst().get(), (a, i) -> java.util.stream.Stream.of(0).map(_v -> a).peek(x -> x[0][i] = Math.min(x[0][x[1][0]] * 2, Math.min(x[0][x[1][1]] * 3, x[0][x[1][2]] * 5))).peek(x -> x[1][0] += x[0][i] == x[0][x[1][0]] * 2 ? 1 : 0).peek(x -> x[1][1] += x[0][i] == x[0][x[1][1]] * 3 ? 1 : 0).peek(x -> x[1][2] += x[0][i] == x[0][x[1][2]] * 5 ? 1 : 0).findFirst().get(), (a, b) -> b)[0][n - 1];
    }
}
// @lc code=end
