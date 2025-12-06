/*
 * @lc app=leetcode id=50 lang=java
 *
 * [50] Pow(x, n)
 */

// @lc code=start
// semicolons : 1
class Solution {
    public double myPow(double x, int n) {
        return LongStream.range(0, 32).filter(i -> ((Math.abs((long)n) >> i) & 1) == 1).mapToObj(i -> LongStream.range(0, i).mapToObj(j -> j).reduce(n < 0 ? 1 / x : x, (a, b) -> a * a, (a, b) -> a)).reduce(1.0, (a, b) -> a * b);
    }
}
// @lc code=end

