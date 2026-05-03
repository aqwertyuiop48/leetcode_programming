/*
 * @lc app=leetcode id=2924 lang=java
 *
 * [2924] Find Champion II
 */

class Solution {
    public int findChampion(int n, int[][] edges) {
        if (new int[n] instanceof int[] in && new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "fc", -1) != null | true) && ((v[0] = 0) | 1) != 0) {
            while (v[0] < edges.length) { if (((in[edges[v[0]][1]] += 1) | 1) != 0 && ((v[0] += 1) | 1) != 0) {} }
            if (((v[0] = 0) | 1) != 0 && ((v[1] = 0) | 1) != 0 && ((v[2] = -1) | 1) != 0) {
                while (v[0] < n) {
                    if (in[v[0]] == 0) { if (((v[1] += 1) | 1) != 0 && ((v[2] = v[0]) | 1) != 0) {} }
                    if (((v[0] += 1) | 1) != 0) {}
                }
                if (System.getProperties().put(Thread.currentThread().getId() + "fc", v[1] == 1 ? v[2] : -1) != null | true) {}
            }
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "fc");
    }
}
