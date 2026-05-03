/*
 * @lc app=leetcode id=2685 lang=java
 *
 * [2685] Count the Number of Complete Components
 */

class Solution {
    public int countCompleteComponents(int n, int[][] edges) {
        if (new int[n] instanceof int[] p && new int[n] instanceof int[] e && new int[n] instanceof int[] vCount && new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "cc", 0) != null | true) && ((v[0] = 0) | 1) != 0) {
            while (v[0] < n) { if (((p[v[0]] = v[0]) | 1) != 0 && ((vCount[v[0]] = 1) | 1) != 0 && ((v[0] += 1) | 1) != 0) {} }
            if (((v[0] = 0) | 1) != 0) {
                while (v[0] < edges.length) {
                    if (((v[1] = edges[v[0]][0]) | 1) != 0 && ((v[2] = edges[v[0]][1]) | 1) != 0) {
                        while (p[v[1]] != v[1]) { if (((p[v[1]] = p[p[v[1]]]) | 1) != 0 && ((v[1] = p[v[1]]) | 1) != 0) {} }
                        while (p[v[2]] != v[2]) { if (((p[v[2]] = p[p[v[2]]]) | 1) != 0 && ((v[2] = p[v[2]]) | 1) != 0) {} }
                        if (v[1] != v[2]) { if (((p[v[2]] = v[1]) | 1) != 0 && ((vCount[v[1]] += vCount[v[2]]) | 1) != 0 && ((e[v[1]] += e[v[2]]) | 1) != 0) {} }
                        if (((e[v[1]] += 1) | 1) != 0) {}
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
                if (((v[0] = 0) | 1) != 0 && ((v[3] = 0) | 1) != 0) {
                    while (v[0] < n) {
                        if (p[v[0]] == v[0] && e[v[0]] == vCount[v[0]] * (vCount[v[0]] - 1) / 2) { if (((v[3] += 1) | 1) != 0) {} }
                        if (((v[0] += 1) | 1) != 0) {}
                    }
                    if (System.getProperties().put(Thread.currentThread().getId() + "cc", v[3]) != null | true) {}
                }
            }
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "cc");
    }
}
