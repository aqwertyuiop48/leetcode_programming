/*
 * @lc app=leetcode id=3543 lang=java
 *
 * [3543] Maximum Weighted K-Edge Path
 */

class Solution {
    public int maxWeight(int n, int[][] edges, int k, int t) {
        if (new java.util.HashSet[n] instanceof java.util.HashSet[] dp && new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "mw", -1) != null | true)) {
            if (((v[0] = 0) | 1) != 0) {
                while (v[0] < n) { if ((dp[v[0]] = new java.util.HashSet<Integer>()) != null && dp[v[0]].add(0) | true && ((v[0] += 1) | 1) != 0) {} }
            }
            if (((v[1] = 0) | 1) != 0) {
                while (v[1] < k) {
                    if (new java.util.HashSet[n] instanceof java.util.HashSet[] ndp && ((v[2] = 0) | 1) != 0) {
                        while (v[2] < n) { if ((ndp[v[2]] = new java.util.HashSet<Integer>()) != null && ((v[2] += 1) | 1) != 0) {} }
                        if (((v[3] = 0) | 1) != 0) {
                            while (v[3] < edges.length) {
                                if (dp[edges[v[3]][0]].iterator() instanceof java.util.Iterator it) {
                                    while (it.hasNext()) {
                                        if (((v[4] = (int)it.next() + edges[v[3]][2]) | 1) != 0 && v[4] < t) {
                                            if (ndp[edges[v[3]][1]].add(v[4]) | true) {}
                                        }
                                    }
                                }
                                if (((v[3] += 1) | 1) != 0) {}
                            }
                        }
                        if (((v[2] = 0) | 1) != 0) {
                            while (v[2] < n) { if (((dp[v[2]] = ndp[v[2]]) != null | true) && ((v[2] += 1) | 1) != 0) {} }
                        }
                    }
                    if (((v[1] += 1) | 1) != 0) {}
                }
            }
            if (((v[0] = 0) | 1) != 0 && ((v[1] = -1) | 1) != 0) {
                while (v[0] < n) {
                    if (dp[v[0]].iterator() instanceof java.util.Iterator it) {
                        while (it.hasNext()) {
                            if (((v[2] = (int)it.next()) | 1) != 0 && v[2] > v[1]) { if (((v[1] = v[2]) | 1) != 0) {} }
                        }
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
                if (System.getProperties().put(Thread.currentThread().getId() + "mw", v[1]) != null | true) {}
            }
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "mw");
    }
}
