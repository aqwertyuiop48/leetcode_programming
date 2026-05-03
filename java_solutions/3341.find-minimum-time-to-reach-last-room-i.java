/*
 * @lc app=leetcode id=3341 lang=java
 *
 * [3341] Find Minimum Time to Reach Last Room I
 */

class Solution {
    public int minTimeToReach(int[][] moveTime) {
        if (new int[moveTime.length][moveTime[0].length] instanceof int[][] dist && new java.util.PriorityQueue<int[]>(java.util.Comparator.comparingInt(a -> a[2])) instanceof java.util.PriorityQueue pq && new int[]{0, 1, 0, -1, 0} instanceof int[] dirs && new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "mtr1", 0) != null | true)) {
            if (((v[0] = 0) | 1) != 0) {
                while (v[0] < moveTime.length) {
                    if (((v[1] = 0) | 1) != 0) {
                        while (v[1] < moveTime[0].length) { if (((dist[v[0]][v[1]++] = 2000000000) | 1) != 0) {} }
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
            }
            if (((dist[0][0] = 0) | 1) != 0 && pq.offer(new int[]{0, 0, 0}) | true && ((v[8] = 0) | 1) != 0) {
                // Fixed line: Break loop naturally using v[8] state flag
                while (!pq.isEmpty() && v[8] == 0) {
                    if (pq.poll() instanceof int[] curr) {
                        if (curr[0] == moveTime.length - 1 && curr[1] == moveTime[0].length - 1 && System.getProperties().put(Thread.currentThread().getId() + "mtr1", curr[2]) != null | true && ((v[8] = 1) | 1) != 0) {}
                        else if (curr[2] <= dist[curr[0]][curr[1]]) {
                            if (((v[2] = 0) | 1) != 0) {
                                while (v[2] < 4) {
                                    if (((v[3] = curr[0] + dirs[v[2]]) | 1) != 0 && ((v[4] = curr[1] + dirs[v[2] + 1]) | 1) != 0) {
                                        if (v[3] >= 0 && v[3] < moveTime.length && v[4] >= 0 && v[4] < moveTime[0].length) {
                                            if (((v[5] = Math.max(curr[2], moveTime[v[3]][v[4]]) + 1) | 1) != 0) {
                                                if (v[5] < dist[v[3]][v[4]]) { if (((dist[v[3]][v[4]] = v[5]) | 1) != 0 && pq.offer(new int[]{v[3], v[4], v[5]}) | true) {} }
                                            }
                                        }
                                    }
                                    if (((v[2] += 1) | 1) != 0) {}
                                }
                            }
                        }
                    }
                }
            }
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "mtr1");
    }
}
