/*
 * @lc app=leetcode id=688 lang=java
 *
 * [688] Knight Probability in Chessboard
 */

class Solution {
    public double knightProbability(int n, int k, int row, int column) {
        return new double[][][]{new double[n][n]} instanceof double[][][] c && (c[0][row][column] = 1) == 1
            && java.util.stream.IntStream.range(0, k).peek(s -> java.util.stream.Stream.<double[][]>of(new double[n][n])
                .peek(nx -> java.util.stream.IntStream.range(0, 8 * n * n)
                    .mapToObj(t -> new int[]{t / 8 / n, t / 8 % n, t / 8 / n + new int[]{1, 2, 2, 1, -1, -2, -2, -1}[t % 8], t / 8 % n + new int[]{2, 1, -1, -2, -2, -1, 1, 2}[t % 8]})
                    .filter(p -> p[2] >= 0 && p[3] >= 0 && p[2] < n && p[3] < n).forEach(p -> nx[p[2]][p[3]] += c[0][p[0]][p[1]] / 8))
                .forEach(nx -> c[0] = nx)).allMatch(x -> true)
            ? java.util.Arrays.stream(c[0]).flatMapToDouble(java.util.Arrays::stream).sum() : 0;
    }
}
