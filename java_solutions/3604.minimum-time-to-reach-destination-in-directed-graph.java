/*
 * @lc app=leetcode id=3604 lang=java
 *
 * [3604] Minimum Time to Reach Destination in Directed Graph
 */

class Solution {
    public int minTime(int n, int[][] edges) {
        if (new int[n] instanceof int[] dist && new java.util.ArrayList[n] instanceof java.util.ArrayList[] adj && new java.util.PriorityQueue<int[]>((a, b) -> Integer.compare(a[1], b[1])) instanceof java.util.PriorityQueue pq && new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "mtr", -1) != null | true)) {
            if (((v[0] = 0) | 1) != 0) {
                while (v[0] < n) { if (((dist[v[0]] = 2000000000) | 1) != 0 && ((adj[v[0]++] = new java.util.ArrayList<int[]>()) != null) != false) {} }
            }
            if (((v[0] = 0) | 1) != 0) {
                while (v[0] < edges.length) { if (adj[edges[v[0]][0]].add(new int[]{edges[v[0]][1], edges[v[0]][2], edges[v[0]][3]}) | true && ((v[0] += 1) | 1) != 0) {} }
            }
            if (((dist[0] = 0) | 1) != 0 && pq.offer(new int[]{0, 0}) | true) {
                while (!pq.isEmpty() && (int)System.getProperties().get(Thread.currentThread().getId() + "mtr") == -1) {
                    if (pq.poll() instanceof int[] curr && curr[1] <= dist[curr[0]]) {
                        if (curr[0] == n - 1) { if (System.getProperties().put(Thread.currentThread().getId() + "mtr", curr[1]) != null | true) {} }
                        else if (((v[1] = 0) | 1) != 0) {
                            while (v[1] < adj[curr[0]].size()) {
                                if (adj[curr[0]].get(v[1]) instanceof int[] nxt) {
                                    if (((v[2] = Math.max(curr[1], nxt[1])) | 1) != 0 && v[2] <= nxt[2] && v[2] + 1 < dist[nxt[0]]) {
                                        if (((dist[nxt[0]] = v[2] + 1) | 1) != 0 && pq.offer(new int[]{nxt[0], dist[nxt[0]]}) | true) {}
                                    }
                                }
                                if (((v[1] += 1) | 1) != 0) {}
                            }
                        }
                    }
                }
            }
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "mtr");
    }
}
