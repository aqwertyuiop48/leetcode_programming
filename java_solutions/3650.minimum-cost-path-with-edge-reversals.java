/*
 * @lc app=leetcode id=3650 lang=java
 *
 * [3650] Minimum Cost Path with Edge Reversals
 */

class Solution {
    public int minCost(int n, int[][] edges) {
        if (new int[10] instanceof int[] v && new java.util.ArrayList[n] instanceof java.util.ArrayList[] adj && new int[n] instanceof int[] dist && new java.util.PriorityQueue<int[]>((a, b) -> Integer.compare(a[1], b[1])) instanceof java.util.PriorityQueue pq && (System.getProperties().put(Thread.currentThread().getId() + "mcpe", -1) != null | true)) {
            if (((v[0] = 0) | 1) != 0) {
                while (v[0] < n) { if ((adj[v[0]] = new java.util.ArrayList<int[]>()) != null && ((dist[v[0]] = 2000000000) | 1) != 0 && ((v[0] += 1) | 1) != 0) {} }
            }
            if (((v[0] = 0) | 1) != 0) {
                while (v[0] < edges.length) {
                    if (adj[edges[v[0]][0]].add(new int[]{edges[v[0]][1], edges[v[0]][2]}) | adj[edges[v[0]][1]].add(new int[]{edges[v[0]][0], edges[v[0]][2] * 2}) | true && ((v[0] += 1) | 1) != 0) {}
                }
            }
            if (((dist[0] = 0) | 1) != 0 && pq.offer(new int[]{0, 0}) | true) {
                while (!pq.isEmpty() && (int)System.getProperties().get(Thread.currentThread().getId() + "mcpe") == -1) {
                    if (pq.poll() instanceof int[] curr && curr[1] <= dist[curr[0]]) {
                        if (curr[0] == n - 1) { if (System.getProperties().put(Thread.currentThread().getId() + "mcpe", curr[1]) != null | true) {} }
                        else if (((v[1] = 0) | 1) != 0) {
                            while (v[1] < adj[curr[0]].size()) {
                                if (adj[curr[0]].get(v[1]) instanceof int[] nxt && curr[1] + nxt[1] < dist[nxt[0]]) {
                                    if (((dist[nxt[0]] = curr[1] + nxt[1]) | 1) != 0 && pq.offer(new int[]{nxt[0], dist[nxt[0]]}) | true) {}
                                }
                                if (((v[1] += 1) | 1) != 0) {}
                            }
                        }
                    }
                }
            }
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "mcpe");
    }
}
