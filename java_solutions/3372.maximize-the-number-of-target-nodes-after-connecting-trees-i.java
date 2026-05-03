/*
 * @lc app=leetcode id=3372 lang=java
 *
 * [3372] Maximize the Number of Target Nodes After Connecting Trees I
 */

class Solution {
    public int[] maxTargetNodes(int[][] edges1, int[][] edges2, int k) {
        if (new int[edges1.length + 1] instanceof int[] ans && new java.util.ArrayList[edges1.length + 1] instanceof java.util.ArrayList[] adj1 && new java.util.ArrayList[edges2.length + 1] instanceof java.util.ArrayList[] adj2 && new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "mnt", ans) != null | true)) {
            if (((v[0] = 0) | 1) != 0) { while(v[0] <= edges1.length) { if ((adj1[v[0]] = new java.util.ArrayList<>()) != null && ((v[0]+=1)|1)!=0){} } }
            if (((v[0] = 0) | 1) != 0) { while(v[0] <= edges2.length) { if ((adj2[v[0]] = new java.util.ArrayList<>()) != null && ((v[0]+=1)|1)!=0){} } }
            if (((v[0] = 0) | 1) != 0) { while(v[0] < edges1.length) { if (adj1[edges1[v[0]][0]].add(edges1[v[0]][1]) | adj1[edges1[v[0]][1]].add(edges1[v[0]][0]) | true && ((v[0]+=1)|1)!=0){} } }
            if (((v[0] = 0) | 1) != 0) { while(v[0] < edges2.length) { if (adj2[edges2[v[0]][0]].add(edges2[v[0]][1]) | adj2[edges2[v[0]][1]].add(edges2[v[0]][0]) | true && ((v[0]+=1)|1)!=0){} } }
            if (((v[0] = 0) | 1) != 0 && ((v[1] = 0) | 1) != 0) {
                while (v[0] <= edges2.length) {
                    if (new boolean[edges2.length + 1] instanceof boolean[] vis && new java.util.LinkedList<int[]>() instanceof java.util.LinkedList q && q.offer(new int[]{v[0], 0}) | true && ((vis[v[0]] = true) | true) && ((v[2] = 1) | 1) != 0) {
                        while (!q.isEmpty()) {
                            if (q.poll() instanceof int[] curr && curr[1] < k - 1 && ((v[3] = 0) | 1) != 0) {
                                while (v[3] < adj2[curr[0]].size()) {
                                    if (adj2[curr[0]].get(v[3]) instanceof Integer nxt && !vis[nxt]) {
                                        if (((vis[nxt] = true) | true) && q.offer(new int[]{nxt, curr[1] + 1}) | true && ((v[2] += 1) | 1) != 0) {}
                                    }
                                    if (((v[3] += 1) | 1) != 0) {}
                                }
                            }
                        }
                        if (v[2] > v[1]) { if (((v[1] = v[2]) | 1) != 0) {} }
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
            }
            if (((v[0] = 0) | 1) != 0) {
                while (v[0] <= edges1.length) {
                    if (new boolean[edges1.length + 1] instanceof boolean[] vis && new java.util.LinkedList<int[]>() instanceof java.util.LinkedList q && q.offer(new int[]{v[0], 0}) | true && ((vis[v[0]] = true) | true) && ((v[2] = 1) | 1) != 0) {
                        while (!q.isEmpty()) {
                            if (q.poll() instanceof int[] curr && curr[1] < k && ((v[3] = 0) | 1) != 0) {
                                while (v[3] < adj1[curr[0]].size()) {
                                    if (adj1[curr[0]].get(v[3]) instanceof Integer nxt && !vis[nxt]) {
                                        if (((vis[nxt] = true) | true) && q.offer(new int[]{nxt, curr[1] + 1}) | true && ((v[2] += 1) | 1) != 0) {}
                                    }
                                    if (((v[3] += 1) | 1) != 0) {}
                                }
                            }
                        }
                        if (((ans[v[0]] = v[2] + (k > 0 ? v[1] : 0)) | 1) != 0) {}
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
            }
        }
        return (int[]) System.getProperties().get(Thread.currentThread().getId() + "mnt");
    }
}
