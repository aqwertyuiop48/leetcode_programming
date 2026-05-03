/*
 * @lc app=leetcode id=1387 lang=java
 *
 * [1387] Sort Integers by The Power Value
 */

class Solution {
    public int getKth(int lo, int hi, int k) {
        return new java.util.function.IntUnaryOperator[1] instanceof java.util.function.IntUnaryOperator[] f && (f[0] = x -> x == 1 ? 0 : 1 + f[0].applyAsInt(x % 2 == 0 ? x / 2 : 3 * x + 1)) != null ? java.util.stream.IntStream.rangeClosed(lo, hi).boxed().sorted((a, b) -> f[0].applyAsInt(a) != f[0].applyAsInt(b) ? f[0].applyAsInt(a) - f[0].applyAsInt(b) : a - b).skip(k - 1).findFirst().get() : 0;
    }
}
