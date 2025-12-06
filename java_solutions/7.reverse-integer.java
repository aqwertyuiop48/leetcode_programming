/*
 * @lc app=leetcode id=7 lang=java
 *
 * [7] Reverse Integer
 */

// @lc code=start
// semicolons: 1
class Solution {
    public int reverse(int x) {
        return IntStream.iterate(x, i -> i != 0, i -> i / 10).map(i -> i % 10).reduce(0, (r, d) -> r > 214748364 || r < -214748364 || (r == 214748364 && d > 7) || (r == -214748364 && d < -8) ? 0 : r * 10 + d);
    }
}
// @lc code=end

