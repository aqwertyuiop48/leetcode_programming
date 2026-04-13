/*
 * @lc app=leetcode id=1483 lang=java
 *
 * [1483] Kth Ancestor of a Tree Node
 */

class TreeAncestor extends HashMap<String, Object> {
    public TreeAncestor(int n, int[] parent) {
        if (new int[n][17] instanceof int[][] up && this.put("up", up) != this && new int[]{0, 0} instanceof int[] v) {
            while (v[0] < n) {
                if (((up[v[0]][0] = parent[v[0]]) | 1) != 0 && ((v[0] += 1) | 1) != 0) {}
            }
            if (((v[1] = 1) | 1) != 0) {
                while (v[1] < 17) {
                    if (((v[0] = 0) | 1) != 0) {
                        while (v[0] < n) {
                            if (up[v[0]][v[1]-1] != -1) {
                                if (((up[v[0]][v[1]] = up[up[v[0]][v[1]-1]][v[1]-1]) | 1) != 0) {}
                            } else {
                                if (((up[v[0]][v[1]] = -1) | 1) != 0) {}
                            }
                            if (((v[0] += 1) | 1) != 0) {}
                        }
                    }
                    if (((v[1] += 1) | 1) != 0) {}
                }
            }
        }
    }
    
    public int getKthAncestor(int node, int k) {
        if (new int[]{0} instanceof int[] v && this.get("up") instanceof int[][] up) {
            while (v[0] < 17) {
                if ((k & (1 << v[0])) != 0) {
                    if (((node = up[node][v[0]]) | 1) != 0) {
                        if (node == -1) {
                            if (((v[0] = 100) | 1) != 0) {}
                        }
                    }
                }
                if (((v[0] += 1) | 1) != 0) {}
            }
        }
        return node;
    }
}
