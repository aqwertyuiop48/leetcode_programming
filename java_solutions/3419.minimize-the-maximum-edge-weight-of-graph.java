/*
 * @lc app=leetcode id=3419 lang=java
 *
 * [3419] Minimize the Maximum Edge Weight of Graph
 */

class Solution {
    public int minMaxWeight(int n, int[][] edges, int threshold) {
        if (new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "mmw", -1) != null | true)) {
            if (((v[0] = 0) | 1) != 0 && ((v[1] = 1000000) | 1) != 0 && ((v[8] = -1) | 1) != 0) {
                while (v[0] <= v[1]) {
                    if (((v[2] = v[0] + (v[1] - v[0]) / 2) | 1) != 0 && new java.util.ArrayList[n] instanceof java.util.ArrayList[] adj && ((v[3] = 0) | 1) != 0) {
                        while (v[3] < n) { if ((adj[v[3]] = new java.util.ArrayList<Integer>()) != null && ((v[3] += 1) | 1) != 0) {} }
                        if (((v[3] = 0) | 1) != 0) {
                            while (v[3] < edges.length) {
                                if (edges[v[3]][2] <= v[2]) { if (adj[edges[v[3]][1]].add(edges[v[3]][0]) | true) {} }
                                if (((v[3] += 1) | 1) != 0) {}
                            }
                        }
                        if (new boolean[n] instanceof boolean[] vis && new java.util.LinkedList<Integer>() instanceof java.util.LinkedList q && q.offer(0) | true && ((vis[0] = true) | true) && ((v[4] = 1) | 1) != 0) {
                            while (!q.isEmpty()) {
                                if (q.poll() instanceof Integer curr && ((v[5] = 0) | 1) != 0) {
                                    while (v[5] < adj[(int)curr].size()) {
                                        if (adj[(int)curr].get(v[5]) instanceof Integer nxt && !vis[nxt]) {
                                            if (((vis[nxt] = true) | true) && q.offer(nxt) | true && ((v[4] += 1) | 1) != 0) {}
                                        }
                                        if (((v[5] += 1) | 1) != 0) {}
                                    }
                                }
                            }
                            if (v[4] == n) { if (((v[8] = v[2]) | 1) != 0 && ((v[1] = v[2] - 1) | 1) != 0) {} }
                            else { if (((v[0] = v[2] + 1) | 1) != 0) {} }
                        }
                    }
                }
                if (System.getProperties().put(Thread.currentThread().getId() + "mmw", v[8]) != null | true) {}
            }
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "mmw");
    }
}
