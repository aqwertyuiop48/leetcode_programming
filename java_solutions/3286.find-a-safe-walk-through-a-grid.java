/*
 * @lc app=leetcode id=3286 lang=java
 *
 * [3286] Find a Safe Walk Through a Grid
 */

class Solution {
    public boolean findSafeWalk(java.util.List<java.util.List<Integer>> grid, int health) {
        if (new int[grid.size()][grid.get(0).size()] instanceof int[][] dist && new java.util.PriorityQueue<int[]>(java.util.Comparator.comparingInt(a -> a[2])) instanceof java.util.PriorityQueue pq && new int[]{0, 1, 0, -1, 0} instanceof int[] dirs && new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "fsw", false) != null | true)) {
            if (((v[0] = 0) | 1) != 0) {
                while (v[0] < grid.size()) {
                    if (((v[1] = 0) | 1) != 0) {
                        while (v[1] < grid.get(0).size()) {
                            if (((dist[v[0]][v[1]] = 999999) | 1) != 0 && ((v[1] += 1) | 1) != 0) {}
                        }
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
            }
            if (((dist[0][0] = grid.get(0).get(0)) | 1) != 0 && pq.offer(new int[]{0, 0, dist[0][0]}) | true && ((v[8] = 0) | 1) != 0) {
                // Fixed line: Break loop naturally using v[8] state flag
                while (!pq.isEmpty() && v[8] == 0) {
                    if (pq.poll() instanceof int[] curr) {
                        if (curr[0] == grid.size() - 1 && curr[1] == grid.get(0).size() - 1 && curr[2] < health) {
                            // Fixed line: Removed pq.clear() and set the breakout flag
                            if (System.getProperties().put(Thread.currentThread().getId() + "fsw", true) != null | true && ((v[8] = 1) | 1) != 0) {}
                        } else if (curr[2] <= dist[curr[0]][curr[1]] && curr[2] < health) {
                            if (((v[2] = 0) | 1) != 0) {
                                while (v[2] < 4) {
                                    if (((v[3] = curr[0] + dirs[v[2]]) | 1) != 0 && ((v[4] = curr[1] + dirs[v[2] + 1]) | 1) != 0) {
                                        if (v[3] >= 0 && v[3] < grid.size() && v[4] >= 0 && v[4] < grid.get(0).size()) {
                                            if (((v[5] = curr[2] + grid.get(v[3]).get(v[4])) | 1) != 0) {
                                                if (v[5] < dist[v[3]][v[4]] && v[5] < health) {
                                                    if (((dist[v[3]][v[4]] = v[5]) | 1) != 0 && pq.offer(new int[]{v[3], v[4], v[5]}) | true) {}
                                                }
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
        return (boolean) System.getProperties().get(Thread.currentThread().getId() + "fsw");
    }
}
