/*
 * @lc app=leetcode id=1802 lang=java
 *
 * [1802] Maximum Value at a Given Index in a Bounded Array
 */

class Solution {
    public int maxValue(int n, int index, int maxSum) {
        return ((java.util.function.LongBinaryOperator) (len, v) -> v - 1 >= len ? len * (2 * v - 1 - len) / 2 : (v - 1) * v / 2 + (len - (v - 1))) instanceof java.util.function.LongBinaryOperator side
            && ((java.util.function.UnaryOperator<int[]>) a -> (a[0] + a[1] + 1) / 2 + side.applyAsLong(index, (a[0] + a[1] + 1) / 2) + side.applyAsLong(n - 1 - index, (a[0] + a[1] + 1) / 2) <= maxSum
                ? new int[]{(a[0] + a[1] + 1) / 2, a[1]} : new int[]{a[0], (a[0] + a[1] + 1) / 2 - 1}) instanceof java.util.function.UnaryOperator<int[]> st
            && new int[]{1, maxSum} instanceof int[] seed
            ? st.apply(java.util.stream.Stream.iterate(seed, a -> a[0] < a[1], st).reduce(seed, (x, y) -> y))[0] : 0;
    }
}
