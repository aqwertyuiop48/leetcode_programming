/*
 * @lc app=leetcode id=2374 lang=java
 *
 * [2374] Node With Highest Edge Score
 */

class Solution {
    public int edgeScore(int[] edges) {
        if (new long[edges.length] instanceof long[] sc && new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "es", 0) != null | true) && ((v[0] = 0) | 1) != 0) {
            while (v[0] < edges.length) { if (((sc[edges[v[0]]] += v[0]) | 1) != 0 && ((v[0] += 1) | 1) != 0) {} }
            if (((v[0] = 0) | 1) != 0 && new long[1] instanceof long[] max && ((v[1] = 0) | 1) != 0) {
                while (v[0] < edges.length) {
                    if (sc[v[0]] > max[0]) { if (((max[0] = sc[v[0]]) | 1) != 0 && ((v[1] = v[0]) | 1) != 0) {} }
                    if (((v[0] += 1) | 1) != 0) {}
                }
                if (System.getProperties().put(Thread.currentThread().getId() + "es", v[1]) != null | true) {}
            }
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "es");
    }
}
