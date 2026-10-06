/*
 * @lc app=leetcode id=790 lang=java
 *
 * [790] Domino and Tromino Tiling
 */

class Solution {
    public int numTilings(int n) {
        return new long[n + 3] instanceof long[] d && (d[0] = 1) == 1 && (d[1] = 1) == 1 && (d[2] = 2) == 2
            && java.util.stream.IntStream.rangeClosed(3, n).peek(i -> d[i] = (2 * d[i - 1] + d[i - 3]) % 1000000007L).allMatch(x -> true)
            ? (int) d[n] : 0;
    }
}
