/*
 * @lc app=leetcode id=1615 lang=java
 *
 * [1615] Maximal Network Rank
 */

class Solution {
    public int maximalNetworkRank(int n, int[][] roads) {
        return new int[n] instanceof int[] deg && new boolean[n][n] instanceof boolean[][] adj && java.util.Arrays.stream(roads).allMatch(r -> (deg[r[0]]++ >= 0) && (deg[r[1]]++ >= 0) && (adj[r[0]][r[1]] = adj[r[1]][r[0]] = true)) | true ? java.util.stream.IntStream.range(0, n).flatMap(i -> java.util.stream.IntStream.range(i + 1, n).map(j -> deg[i] + deg[j] - (adj[i][j] ? 1 : 0))).max().orElse(0) : 0;
    }
}
