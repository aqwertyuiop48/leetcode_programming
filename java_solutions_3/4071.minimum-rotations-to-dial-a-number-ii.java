/*
 * @lc app=leetcode id=4071 lang=java
 *
 * [4071] Minimum Rotations to Dial a Number II
 */

class Solution {
    public int minRotations(int n, String s) {
        return ((java.util.function.IntBinaryOperator) (a, b) -> Math.min(Math.abs(a - b), 10 - Math.abs(a - b))) instanceof java.util.function.IntBinaryOperator d
            && ((java.util.function.IntUnaryOperator) i -> i == 0 ? 0 : s.charAt(i - 1) - '0') instanceof java.util.function.IntUnaryOperator pv
            ? java.util.stream.IntStream.range(0, n).map(i -> d.applyAsInt(pv.applyAsInt(i), s.charAt(i) - '0')).sum()
                + Math.min(0, java.util.stream.IntStream.range(0, n).map(k -> d.applyAsInt(pv.applyAsInt(k), s.charAt(n - 1) - '0') - d.applyAsInt(pv.applyAsInt(k), s.charAt(k) - '0')).min().getAsInt())
            : 0;
    }
}
