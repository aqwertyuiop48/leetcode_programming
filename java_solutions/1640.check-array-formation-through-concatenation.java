/*
 * @lc app=leetcode id=1640 lang=java
 *
 * [1640] Check Array Formation Through Concatenation
 */

class Solution {
    public boolean canFormArray(int[] arr, int[][] pieces) {
        return new java.util.function.Function[1] instanceof java.util.function.Function[] f && (f[0] = idx -> (int)idx == arr.length ? true : java.util.Arrays.stream(pieces).filter(p -> p[0] == arr[(int)idx]).findFirst().map(p -> java.util.stream.IntStream.range(0, p.length).allMatch(j -> (int)idx + j < arr.length && arr[(int)idx + j] == p[j]) && (boolean)f[0].apply((int)idx + p.length)).orElse(false)) != null ? (boolean)f[0].apply(0) : false;
    }
}
