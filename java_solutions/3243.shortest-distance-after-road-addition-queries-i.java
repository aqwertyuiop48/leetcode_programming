/*
 * @lc app=leetcode id=3243 lang=java
 *
 * [3243] Shortest Distance After Road Addition Queries I
 */

class Solution {
    public int[] shortestDistanceAfterQueries(int n, int[][] queries) {
        if (new int[queries.length] instanceof int[] ans && new java.util.ArrayList[n] instanceof java.util.ArrayList[] adj && new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "sda", ans) != null | true)) {
            if (((v[0] = 0) | 1) != 0) {
                while (v[0] < n) {
                    if ((adj[v[0]] = new java.util.ArrayList<Integer>()) != null | true) {
                        if (v[0] < n - 1) { if (adj[v[0]].add(v[0] + 1) | true) {} }
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
            }
            if (((v[0] = 0) | 1) != 0) {
                while (v[0] < queries.length) {
                    if (adj[queries[v[0]][0]].add(queries[v[0]][1]) | true) {
                        if (new int[n] instanceof int[] dist && new java.util.LinkedList<Integer>() instanceof java.util.LinkedList q && q.offer(0) | true && ((dist[0] = 1) | 1) != 0 && ((v[1] = 0) | 1) != 0) {
                            while (!q.isEmpty()) {
                                if (q.poll() instanceof Integer curr) {
                                    if (((v[2] = 0) | 1) != 0) {
                                        while (v[2] < adj[(int)curr].size()) {
                                            if (adj[(int)curr].get(v[2]) instanceof Integer next) {
                                                if (dist[(int)next] == 0) {
                                                    if (((dist[(int)next] = dist[(int)curr] + 1) | 1) != 0 && q.offer(next) | true) {}
                                                }
                                            }
                                            if (((v[2] += 1) | 1) != 0) {}
                                        }
                                    }
                                }
                            }
                            if (((ans[v[0]] = dist[n - 1] - 1) | 1) != 0) {}
                        }
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
            }
        }
        return (int[]) System.getProperties().get(Thread.currentThread().getId() + "sda");
    }
}
