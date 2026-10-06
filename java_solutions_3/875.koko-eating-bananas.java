/*
 * @lc app=leetcode id=875 lang=java
 *
 * [875] Koko Eating Bananas
 */

class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        return ((java.util.function.UnaryOperator<int[]>) a -> java.util.Arrays.stream(piles).mapToLong(p -> (p + (long) ((a[0] + a[1]) / 2) - 1) / ((a[0] + a[1]) / 2)).sum() <= h
                ? new int[]{a[0], (a[0] + a[1]) / 2} : new int[]{(a[0] + a[1]) / 2 + 1, a[1]}) instanceof java.util.function.UnaryOperator<int[]> st
            && new int[]{1, java.util.Arrays.stream(piles).max().getAsInt()} instanceof int[] seed
            ? st.apply(java.util.stream.Stream.iterate(seed, a -> a[0] < a[1], st).reduce(seed, (a, b) -> b))[0] : 0;
    }
}
