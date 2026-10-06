/*
 * @lc app=leetcode id=764 lang=java
 *
 * [764] Largest Plus Sign
 */

class Solution {
    public int orderOfLargestPlusSign(int n, int[][] mines) {
        return new int[n][n] instanceof int[][] d && new int[1] instanceof int[] l
            && java.util.stream.IntStream.range(0, n).peek(i -> java.util.Arrays.fill(d[i], n)).allMatch(x -> true)
            && java.util.Arrays.stream(mines).peek(m -> d[m[0]][m[1]] = 0).allMatch(x -> true)
            && java.util.stream.IntStream.range(0, 4 * n).map(x -> (l[0] = 0) + java.util.stream.IntStream.range(0, n)
                .mapToObj(u -> new int[]{x / n < 2 ? x % n : x / n == 2 ? u : n - 1 - u, x / n == 0 ? u : x / n == 1 ? n - 1 - u : x % n})
                .map(p -> d[p[0]][p[1]] = Math.min(d[p[0]][p[1]], l[0] = d[p[0]][p[1]] == 0 ? 0 : l[0] + 1)).mapToInt(v -> v).sum()).sum() >= 0
            ? java.util.Arrays.stream(d).flatMapToInt(java.util.Arrays::stream).max().getAsInt() : 0;
    }
}
