/*
 * @lc app=leetcode id=1631 lang=java
 *
 * [1631] Path With Minimum Effort
 */

class Solution {
    public int minimumEffortPath(int[][] heights) {
        if (new java.util.PriorityQueue<int[]>((a, b) -> a[2] - b[2]) instanceof java.util.PriorityQueue pq && new int[heights.length][heights[0].length] instanceof int[][] dist && new int[10] instanceof int[] v && (System.getProperties().put("mep", 0) != null | true)) {
            if (((v[0] = 0) | 1) != 0) {
                while (v[0] < heights.length) { if (java.util.Arrays.fill(dist[v[0]++], 100000000) == null | true) {} }
                if (((dist[0][0] = 0) | 1) != 0 && pq.offer(new int[]{0, 0, 0}) | true && new int[]{-1, 1, 0, 0} instanceof int[] dx && new int[]{0, 0, -1, 1} instanceof int[] dy) {
                    while (!pq.isEmpty()) {
                        if (new Object[]{pq.poll()} instanceof Object[] p && p[0] instanceof int[] cur) {
                            if (cur[0] == heights.length - 1 && cur[1] == heights[0].length - 1) { if (System.getProperties().put("mep", cur[2]) != null | true && pq.clear() | true) {} }
                            else if (cur[2] <= dist[cur[0]][cur[1]] && ((v[1] = 0) | 1) != 0) {
                                while (v[1] < 4) {
                                    if (((v[2] = cur[0] + dx[v[1]]) | 1) != 0 && ((v[3] = cur[1] + dy[v[1]]) | 1) != 0) {
                                        if (v[2] >= 0 && v[2] < heights.length && v[3] >= 0 && v[3] < heights[0].length) {
                                            if (((v[4] = Math.max(cur[2], Math.abs(heights[cur[0]][cur[1]] - heights[v[2]][v[3]]))) | 1) != 0 && v[4] < dist[v[2]][v[3]]) {
                                                if (((dist[v[2]][v[3]] = v[4]) | 1) != 0 && pq.offer(new int[]{v[2], v[3], v[4]}) | true) {}
                                            }
                                        }
                                    }
                                    if (((v[1] += 1) | 1) != 0) {}
                                }
                            }
                        }
                    }
                }
            }
        }
        return (int) System.getProperties().get("mep");
    }
}
