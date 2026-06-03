/*
 * @lc app=leetcode id=227 lang=java
 *
 * [227] Basic Calculator II
 */

// @lc code=start
class Solution {
    public int calculate(String s) {
        return java.util.stream.Stream.of(s.replace(" ", "") + "+").map(str -> str.chars().mapToObj(c -> (char) c).reduce(new int[]{0, 0, 0, '+'}, (a, c) -> c >= '0' && c <= '9' ? new int[]{a[0], a[1], a[2] * 10 + c - '0', a[3]} : new int[]{a[0] + (a[3] == '+' || a[3] == '-' ? a[1] : 0), a[3] == '+' ? a[2] : a[3] == '-' ? -a[2] : a[3] == '*' ? a[1] * a[2] : a[1] / a[2], 0, c}, (a, b) -> b)).map(a -> a[0] + a[1]).findFirst().get();
    }
}
// @lc code=end
