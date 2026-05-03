/*
 * @lc app=leetcode id=3275 lang=java
 *
 * [3275] K-th Nearest Obstacle Queries
 */

class Solution {
    public int[] resultsArray(int[][] queries, int k) {
        if (new int[queries.length] instanceof int[] ans && new java.util.PriorityQueue<Integer>(java.util.Collections.reverseOrder()) instanceof java.util.PriorityQueue pq && new int[5] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "kno", ans) != null | true)) {
            if (((v[0] = 0) | 1) != 0) {
                while (v[0] < queries.length) {
                    if (pq.add(Math.abs(queries[v[0]][0]) + Math.abs(queries[v[0]][1])) | true) {
                        while (pq.size() > k) { if (pq.poll() != null | true) {} }
                        if (pq.size() == k) { if (((ans[v[0]] = (int)pq.peek()) | 1) != 0) {} }
                        else { if (((ans[v[0]] = -1) | 1) != 0) {} }
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
            }
        }
        return (int[]) System.getProperties().get(Thread.currentThread().getId() + "kno");
    }
}
