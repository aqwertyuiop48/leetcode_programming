/*
 * @lc app=leetcode id=3558 lang=java
 *
 * [3558] Number of Ways to Assign Edge Weights I
 */

class Solution {
    public int assignEdgeWeights(int[][] edges) {
        if (new int[edges.length + 2] instanceof int[] dist && new java.util.ArrayList[edges.length + 2] instanceof java.util.ArrayList[] adj && new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "nwa", 0) != null | true)) {
            if (((v[0] = 0) | 1) != 0) {
                while(v[0] <= edges.length + 1) { if ((adj[v[0]] = new java.util.ArrayList<Integer>()) != null && ((v[0] += 1) | 1) != 0) {} }
            }
            if (((v[0] = 0) | 1) != 0) {
                while(v[0] < edges.length) { if (adj[edges[v[0]][0]].add(edges[v[0]][1]) | adj[edges[v[0]][1]].add(edges[v[0]][0]) | true && ((v[0] += 1) | 1) != 0) {} }
            }
            if (new java.util.LinkedList<Integer>() instanceof java.util.LinkedList q && q.offer(1) | true && ((dist[1] = 1) | 1) != 0 && ((v[1] = 0) | 1) != 0) {
                while(!q.isEmpty()) {
                    if (q.poll() instanceof Integer curr) {
                        if (dist[(int)curr] - 1 > v[1]) { if (((v[1] = dist[(int)curr] - 1) | 1) != 0) {} }
                        if (((v[2] = 0) | 1) != 0) {
                            while(v[2] < adj[(int)curr].size()) {
                                if (adj[(int)curr].get(v[2]) instanceof Integer nxt && dist[(int)nxt] == 0) {
                                    if (((dist[(int)nxt] = dist[(int)curr] + 1) | 1) != 0 && q.offer(nxt) | true) {}
                                }
                                if (((v[2] += 1) | 1) != 0) {}
                            }
                        }
                    }
                }
                if (((v[3] = 1) | 1) != 0 && ((v[4] = v[1] - 1) | 1) != 0 && ((v[5] = 2) | 1) != 0) {
                    while(v[4] > 0) {
                        if (v[4] % 2 == 1) { if (((v[3] = (int)(((long)v[3] * v[5]) % 1000000007)) | 1) != 0) {} }
                        if (((v[5] = (int)(((long)v[5] * v[5]) % 1000000007)) | 1) != 0 && ((v[4] /= 2) | 1) != 0) {}
                    }
                    if (System.getProperties().put(Thread.currentThread().getId() + "nwa", v[3]) != null | true) {}
                }
            }
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "nwa");
    }
}
