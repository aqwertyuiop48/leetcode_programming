/*
 * @lc app=leetcode id=279 lang=java
 *
 * [279] Perfect Squares
 */

class Solution {
    public int numSquares(int n) {
        return Math.sqrt(n) == (int)Math.sqrt(n) ? 1 : Math.abs(java.util.stream.Stream.iterate(n, x -> x % 4 == 0 ? x / 4 : -x).filter(x -> x < 0 || x % 4 != 0).findFirst().get()) % 8 == 7 ? 4 : java.util.stream.IntStream.rangeClosed(1, (int)Math.sqrt(n)).anyMatch(i -> Math.sqrt(n - i * i) == (int)Math.sqrt(n - i * i)) ? 2 : 3;
    }
}
