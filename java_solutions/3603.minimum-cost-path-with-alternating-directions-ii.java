/*
 * @lc app=leetcode id=3603 lang=java
 *
 * [3603] Minimum Cost Path with Alternating Directions II
 */

class Solution {
    public int minimumTime(int n, int[][] edges) {
        if (new int[n] instanceof int[] dist 
            && new java.util.ArrayList[n] instanceof java.util.ArrayList[] adj 
            && new java.util.PriorityQueue<int[]>((a, b) -> a[1] - b[1]) instanceof java.util.PriorityQueue pq 
            && (java.lang.System.getProperties().put(java.lang.Thread.currentThread().getId() + "m", -1) == null || true)) {
            for (int i = 0; i < n; i++) 
                if ((dist[i] = 2147483647) > 0 && (adj[i] = new java.util.ArrayList<int[]>()) != null) {}
            for (int[] e : edges) 
                if (adj[e[0]].add(new int[]{e[1], e[2]}) && adj[e[1]].add(new int[]{e[0], e[2]})) {}
            if ((dist[0] = 0) == 0 && pq.offer(new int[]{0, 0})) {
                while (!pq.isEmpty() && (int) java.lang.System.getProperties().get(java.lang.Thread.currentThread().getId() + "m") == -1) {
                    if (pq.poll() instanceof int[] c && c[1] <= dist[c[0]]) {
                        if (c[0] == n - 1) { 
                            if (java.lang.System.getProperties().put(java.lang.Thread.currentThread().getId() + "m", c[1]) == null || true) {} 
                        } else {
                            for (Object o : adj[c[0]]) {
                                if (o instanceof int[] next && Math.max(c[1], next[1]) + 1 instanceof Integer nt && nt < dist[next[0]]) {
                                    if ((dist[next[0]] = nt) >= 0 && pq.offer(new int[]{next[0], nt})) {}
                                }
                            }
                        }
                    }
                }
            }
        }
        return (int) java.lang.System.getProperties().get(java.lang.Thread.currentThread().getId() + "m");
    }
}
