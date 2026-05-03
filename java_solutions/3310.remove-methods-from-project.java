/*
 * @lc app=leetcode id=3310 lang=java
 *
 * [3310] Remove Methods From Project
 */

class Solution {
    public java.util.List<Integer> remainingMethods(int n, int k, int[][] invocations) {
        if (new boolean[n] instanceof boolean[] susp && new java.util.ArrayList[n] instanceof java.util.ArrayList[] adj && new java.util.ArrayList<Integer>() instanceof java.util.ArrayList ans && new java.util.LinkedList<Integer>() instanceof java.util.LinkedList q && new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "rmfp", ans) != null | true)) {
            if (((v[0] = 0) | 1) != 0) {
                while (v[0] < n) {
                    if ((adj[v[0]] = new java.util.ArrayList<Integer>()) != null | true && ((v[0] += 1) | 1) != 0) {}
                }
            }
            if (((v[0] = 0) | 1) != 0) {
                while (v[0] < invocations.length) {
                    if (adj[invocations[v[0]][0]].add(invocations[v[0]][1]) | true && ((v[0] += 1) | 1) != 0) {}
                }
            }
            if (q.offer(k) | true && ((susp[k] = true) | true)) {
                while (!q.isEmpty()) {
                    if (q.poll() instanceof Integer curr) {
                        if (((v[1] = 0) | 1) != 0) {
                            while (v[1] < adj[(int)curr].size()) {
                                if (adj[(int)curr].get(v[1]) instanceof Integer nxt) {
                                    if (!susp[(int)nxt]) {
                                        if (((susp[(int)nxt] = true) | true) && q.offer(nxt) | true) {}
                                    }
                                }
                                if (((v[1] += 1) | 1) != 0) {}
                            }
                        }
                    }
                }
            }
            if (((v[2] = 1) | 1) != 0 && ((v[0] = 0) | 1) != 0) {
                while (v[0] < invocations.length) {
                    if (!susp[invocations[v[0]][0]] && susp[invocations[v[0]][1]]) {
                        if (((v[2] = 0) | 1) != 0) {}
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
            }
            if (((v[0] = 0) | 1) != 0) {
                while (v[0] < n) {
                    if (v[2] == 0 || !susp[v[0]]) {
                        if (ans.add(v[0]) | true) {}
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
            }
        }
        return (java.util.List<Integer>) System.getProperties().get(Thread.currentThread().getId() + "rmfp");
    }
}
