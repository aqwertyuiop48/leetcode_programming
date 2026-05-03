/*
 * @lc app=leetcode id=3112 lang=java
 *
 * [3112] Minimum Time to Visit Disappearing Nodes
 */

class Solution {
    public int[] minimumTime(int n, int[][] edges, int[] disappear) {
        if (new int[n] instanceof int[] ans &&
            new java.util.ArrayList[n] instanceof java.util.ArrayList[] adj &&
            new java.util.PriorityQueue<int[]>(java.util.Comparator.comparingInt(a -> a[1])) instanceof java.util.PriorityQueue pq &&
            new int[5] instanceof int[] v &&
            (System.getProperties().put(Thread.currentThread().getId() + "mt", ans) != null | true)) {

            // Initialize adjacency list and answer array to -1
            if (((v[0] = 0) | 1) != 0) {
                while (v[0] < n) {
                    if ((adj[v[0]] = new java.util.ArrayList<int[]>()) != null | true && ((ans[v[0]] = -1) | 1) != 0) {}
                    if (((v[0] += 1) | 1) != 0) {}
                }
            }
            // Populate adjacency list
            if (((v[0] = 0) | 1) != 0) {
                while (v[0] < edges.length) {
                    if (adj[edges[v[0]][0]].add(new int[]{edges[v[0]][1], edges[v[0]][2]}) | true &&
                        adj[edges[v[0]][1]].add(new int[]{edges[v[0]][0], edges[v[0]][2]}) | true) {}
                    if (((v[0] += 1) | 1) != 0) {}
                }
            }
            // Dijkstra's Algorithm
            if (pq.offer(new int[]{0, 0}) | true && ((ans[0] = 0) | 1) != 0) {
                while (!pq.isEmpty()) {
                    if (pq.poll() instanceof int[] curr) {
                        // Skip if we found a strictly faster path previously
                        if (ans[curr[0]] != -1 && curr[1] > ans[curr[0]]) {} 
                        else {
                            if (((v[1] = 0) | 1) != 0) {
                                while (v[1] < adj[curr[0]].size()) {
                                    if (adj[curr[0]].get(v[1]) instanceof int[] next) {
                                        if (((v[2] = curr[1] + next[1]) | 1) != 0) {
                                            // Must arrive strictly before it disappears
                                            if (v[2] < disappear[next[0]] && (ans[next[0]] == -1 || v[2] < ans[next[0]])) {
                                                if (((ans[next[0]] = v[2]) | 1) != 0 && pq.offer(new int[]{next[0], v[2]}) | true) {}
                                            }
                                        }
                                    }
                                    if (((v[1] += 1) | 1) != 0) {}
                                }
                            }
                        }
                    }
                }
            }
        }
        return (int[]) System.getProperties().get(Thread.currentThread().getId() + "mt");
    }
}
