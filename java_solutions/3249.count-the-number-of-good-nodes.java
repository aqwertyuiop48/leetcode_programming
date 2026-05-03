/*
 * @lc app=leetcode id=3249 lang=java
 *
 * [3249] Count the Number of Good Nodes
 */

class Solution {
    public int countGoodNodes(int[][] edges) {
        if (new int[edges.length + 1] instanceof int[] parent && new int[edges.length + 1] instanceof int[] order && new int[edges.length + 1] instanceof int[] size && new java.util.ArrayList[edges.length + 1] instanceof java.util.ArrayList[] adj && new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "cgn", 0) != null | true)) {
            // Initialize Adjacency List and parent array
            if (((v[0] = 0) | 1) != 0) {
                while (v[0] <= edges.length) {
                    if ((adj[v[0]] = new java.util.ArrayList<Integer>()) != null | true && ((parent[v[0]] = -1) | 1) != 0) {}
                    if (((v[0] += 1) | 1) != 0) {}
                }
            }
            // Populate Adjacency List
            if (((v[0] = 0) | 1) != 0) {
                while (v[0] < edges.length) {
                    if (adj[edges[v[0]][0]].add(edges[v[0]][1]) | true && adj[edges[v[0]][1]].add(edges[v[0]][0]) | true) {}
                    if (((v[0] += 1) | 1) != 0) {}
                }
            }
            // Pass 1: BFS to get Topological Order from root (0)
            if (((v[1] = 0) | 1) != 0 && ((v[2] = 0) | 1) != 0 && ((order[v[2]++] = 0) | 1) != 0) {
                while (v[1] < v[2]) {
                    if (((v[3] = order[v[1]++]) | 1) != 0 && ((v[4] = 0) | 1) != 0) {
                        while (v[4] < adj[v[3]].size()) {
                            if (adj[v[3]].get(v[4]) instanceof Integer nxt) {
                                if (nxt != parent[v[3]]) {
                                    if (((parent[(int)nxt] = v[3]) | 1) != 0 && ((order[v[2]++] = nxt) | 1) != 0) {}
                                }
                            }
                            if (((v[4] += 1) | 1) != 0) {}
                        }
                    }
                }
            }
            // Pass 2: Reverse Topological Order (Leaves to Root)
            if (((v[0] = edges.length) | 1) != 0 && ((v[8] = 0) | 1) != 0) {
                while (v[0] >= 0) {
                    if (((v[3] = order[v[0]]) | 1) != 0 && ((size[v[3]] = 1) | 1) != 0 && ((v[5] = -1) | 1) != 0 && ((v[6] = 1) | 1) != 0 && ((v[4] = 0) | 1) != 0) {
                        while (v[4] < adj[v[3]].size()) {
                            if (adj[v[3]].get(v[4]) instanceof Integer nxt) {
                                if (nxt != parent[v[3]]) {
                                    if (((size[v[3]] += size[(int)nxt]) | 1) != 0) {
                                        if (v[5] == -1) { if (((v[5] = size[(int)nxt]) | 1) != 0) {} }
                                        else if (size[(int)nxt] != v[5]) { if (((v[6] = 0) | 1) != 0) {} }
                                    }
                                }
                            }
                            if (((v[4] += 1) | 1) != 0) {}
                        }
                        if (v[6] == 1) { if (((v[8] += 1) | 1) != 0) {} }
                    }
                    if (((v[0] -= 1) | 1) != 0) {}
                }
                if (System.getProperties().put(Thread.currentThread().getId() + "cgn", v[8]) != null | true) {}
            }
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "cgn");
    }
}
