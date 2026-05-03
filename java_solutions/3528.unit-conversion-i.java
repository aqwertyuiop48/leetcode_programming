/*
 * @lc app=leetcode id=3528 lang=java
 *
 * [3528] Unit Conversion I
 */

class Solution {
    public int[] baseUnitConversions(int[][] conversions) {
        if (new int[conversions.length + 1] instanceof int[] ans && new java.util.ArrayList[conversions.length + 1] instanceof java.util.ArrayList[] adj && new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "buc", ans) != null | true)) {
            if (((v[0] = 0) | 1) != 0) {
                while (v[0] <= conversions.length) { if ((adj[v[0]] = new java.util.ArrayList<int[]>()) != null && ((v[0] += 1) | 1) != 0) {} }
            }
            if (((v[0] = 0) | 1) != 0) {
                while (v[0] < conversions.length) {
                    if (adj[conversions[v[0]][0]].add(new int[]{conversions[v[0]][1], conversions[v[0]][2]}) | true && ((v[0] += 1) | 1) != 0) {}
                }
            }
            if (new java.util.LinkedList<Integer>() instanceof java.util.LinkedList q && q.offer(0) | true && ((ans[0] = 1) | 1) != 0) {
                while (!q.isEmpty()) {
                    if (q.poll() instanceof Integer curr && ((v[1] = 0) | 1) != 0) {
                        while (v[1] < adj[(int)curr].size()) {
                            if (adj[(int)curr].get(v[1]) instanceof int[] nxt) {
                                if (((ans[nxt[0]] = (int)(((long)ans[(int)curr] * nxt[1]) % 1000000007)) | 1) != 0 && q.offer(nxt[0]) | true) {}
                            }
                            if (((v[1] += 1) | 1) != 0) {}
                        }
                    }
                }
            }
        }
        return (int[]) System.getProperties().get(Thread.currentThread().getId() + "buc");
    }
}
