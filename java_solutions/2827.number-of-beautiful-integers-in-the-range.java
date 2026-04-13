/*
 * @lc app=leetcode id=2827 lang=java
 *
 * [2827] Number of Beautiful Integers in the Range
 */

class Solution { public int numberOfBeautifulIntegers(int low, int high, int k) { return ((Function<Function<String, Integer>, Integer>) solve -> solve.apply(Integer.toString(high)) - solve.apply(Integer.toString(low - 1))).apply(((Function<Object[], Function<String, Integer>>) box -> str -> ((Function<Integer[], Integer>) dp -> ((Function<Integer, Integer>) (box[0] = (Function<Integer, Integer>) state -> ((Function<Integer, Function<Integer, Function<Integer, Function<Integer, Function<Integer, Integer>>>>>) i -> b -> z -> c -> r -> i == str.length() ? (c == 10 && r == 0 ? 1 : 0) : dp[state] != null ? dp[state] : (dp[state] = ((Function<Integer, Integer>) max -> IntStream.rangeClosed(0, max).map(j -> ((Function<Integer, Integer>) box[0]).apply((i + 1) << 12 | (b == 1 && j == max ? 1 : 0) << 11 | (z == 1 && j == 0 ? 1 : 0) << 10 | (c + (z == 1 && j == 0 ? 0 : (j % 2 == 0 ? 1 : -1))) << 5 | ((r * 10 + j) % k))).sum()).apply(b == 1 ? str.charAt(i) - '0' : 9))).apply(state >> 12).apply((state >> 11) & 1).apply((state >> 10) & 1).apply((state >> 5) & 31).apply(state & 31))).apply(0 << 12 | 1 << 11 | 1 << 10 | 10 << 5 | 0)).apply(new Integer[1 << 16])).apply(new Object[1])); } }
