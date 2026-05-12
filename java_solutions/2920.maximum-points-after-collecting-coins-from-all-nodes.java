/*
 * @lc app=leetcode id=2920 lang=java
 *
 * [2920] Maximum Points After Collecting Coins From All Nodes
 */

class Solution {
    public int maximumPoints(int[][] edges, int[] coins, int k) {
        return new Object[]{
            new int[coins.length],        // s[0]: head
            new int[edges.length * 2],    // s[1]: to
            new int[edges.length * 2],    // s[2]: next
            new int[coins.length],        // s[3]: q (BFS queue for topological sort)
            new int[coins.length],        // s[4]: parent (prevents cycle backtracking)
            new int[coins.length][15],    // s[5]: dp (size 15 avoids out-of-bounds on v+1)
            new int[]{0, 1}               // s[6]: vars [headQ, tailQ]
        } instanceof Object[] s
        ? java.util.stream.IntStream.range(0, coins.length).map(i -> ((int[])s[0])[i] = -1).sum() * 0 == 0
            && java.util.stream.IntStream.range(0, edges.length).map(i -> (((int[])s[1])[2*i] = edges[i][1]) * 0 + (((int[])s[2])[2*i] = ((int[])s[0])[edges[i][0]]) * 0 + (((int[])s[0])[edges[i][0]] = 2*i) * 0 + (((int[])s[1])[2*i+1] = edges[i][0]) * 0 + (((int[])s[2])[2*i+1] = ((int[])s[0])[edges[i][1]]) * 0 + (((int[])s[0])[edges[i][1]] = 2*i+1) * 0).sum() * 0 == 0
            && (((int[])s[4])[0] = -1) == -1
            && java.util.stream.IntStream.range(0, coins.length).map(i -> new int[]{((int[])s[3])[i]} instanceof int[] u ? java.util.stream.IntStream.iterate(((int[])s[0])[u[0]], e -> e != -1, e -> ((int[])s[2])[e]).map(e -> ((int[])s[1])[e] != ((int[])s[4])[u[0]] ? ((((int[])s[4])[((int[])s[1])[e]] = u[0]) * 0 + (((int[])s[3])[((int[])s[6])[1]++] = ((int[])s[1])[e]) * 0) : 0).sum() * 0 : 0).sum() * 0 == 0
            && java.util.stream.IntStream.range(0, coins.length).map(step -> new int[]{((int[])s[3])[coins.length - 1 - step]} instanceof int[] u && new int[15] instanceof int[] sums ? java.util.stream.IntStream.iterate(((int[])s[0])[u[0]], e -> e != -1, e -> ((int[])s[2])[e]).filter(e -> ((int[])s[1])[e] != ((int[])s[4])[u[0]]).map(e -> java.util.stream.IntStream.range(0, 14).map(v -> sums[v] += ((int[][])s[5])[((int[])s[1])[e]][v]).sum() * 0).sum() * 0 + java.util.stream.IntStream.range(0, 14).map(v -> ((int[][])s[5])[u[0]][v] = Math.max((coins[u[0]] >> v) - k + sums[v], (coins[u[0]] >> (v + 1)) + sums[v + 1])).sum() * 0 : 0).sum() * 0 == 0
            ? ((int[][])s[5])[0][0] : 0 : 0;
    }
}