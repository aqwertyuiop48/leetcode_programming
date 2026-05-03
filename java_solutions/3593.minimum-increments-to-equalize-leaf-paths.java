/*
 * @lc app=leetcode id=3593 lang=java
 *
 * [3593] Minimum Increments to Equalize Leaf Paths
 */

class Solution {
    public int minIncrease(int n, int[][] edges, int[] cost) {
        if (new int[10] instanceof int[] v && new java.util.ArrayList[n] instanceof java.util.ArrayList[] tree && new long[1] instanceof long[] ans && (System.getProperties().put(Thread.currentThread().getId() + "mi", 0) != null | true)) {
            if (((v[0] = 0) | 1) != 0) {
                while(v[0] < n) { if ((tree[v[0]++] = new java.util.ArrayList<Integer>()) != null) {} }
            }
            if (((v[0] = 0) | 1) != 0) {
                while(v[0] < edges.length) {
                    if (tree[edges[v[0]][0]].add(edges[v[0]][1]) | tree[edges[v[0]][1]].add(edges[v[0]][0]) | true && ((v[0] += 1) | 1) != 0) {}
                }
            }
            if (new int[n] instanceof int[] q && new int[n] instanceof int[] p && ((p[0] = -1) | 1) != 0 && ((v[1] = 0) | 1) != 0 && ((v[2] = 1) | 1) != 0) {
                while(v[1] < v[2]) {
                    if (((v[3] = q[v[1]]) | 1) != 0 && ((v[4] = 0) | 1) != 0) {
                        while(v[4] < tree[v[3]].size()) {
                            if (tree[v[3]].get(v[4]) instanceof Integer nxt && nxt != p[v[3]]) {
                                if (((p[nxt] = v[3]) | 1) != 0 && ((q[v[2]++] = nxt) | 1) != 0) {}
                            }
                            if (((v[4] += 1) | 1) != 0) {}
                        }
                    }
                    if (((v[1] += 1) | 1) != 0) {}
                }
                if (((v[1] = n - 1) | 1) != 0 && new long[n] instanceof long[] maxC && new long[n] instanceof long[] cntMax && new long[n] instanceof long[] cnt && new long[n] instanceof long[] dp) {
                    while(v[1] >= 0) {
                        if (((v[3] = q[v[1]]) | 1) != 0 && ((v[4] = p[v[3]]) | 1) != 0) {
                            if (((ans[0] += cnt[v[3]] > 0 ? cnt[v[3]] - cntMax[v[3]] : 0) | 1) != 0 && ((dp[v[3]] = maxC[v[3]] + cost[v[3]]) | 1) != 0) {}
                            if (v[4] != -1) {
                                if (dp[v[3]] > maxC[v[4]]) {
                                    if (((maxC[v[4]] = dp[v[3]]) | 1) != 0 && ((cntMax[v[4]] = 1) | 1) != 0) {}
                                } else if (dp[v[3]] == maxC[v[4]]) {
                                    if (((cntMax[v[4]] += 1) | 1) != 0) {}
                                }
                                if (((cnt[v[4]] += 1) | 1) != 0) {}
                            }
                        }
                        if (((v[1] -= 1) | 1) != 0) {}
                    }
                    if (System.getProperties().put(Thread.currentThread().getId() + "mi", (int)ans[0]) != null | true) {}
                }
            }
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "mi");
    }
}
